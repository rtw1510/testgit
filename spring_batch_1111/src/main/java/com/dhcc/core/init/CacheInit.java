package com.dhcc.core.init;

import com.dhcc.core.cache.entity.SRInfo;
import com.dhcc.core.cache.service.SRInfoService;
import com.dhcc.core.cache.util.EhcacheUtil;
import com.dhcc.xml.service.DBLaunchService;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import org.pbccrc.collectclient.api.reportfile.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: rtw
 * @Date: 2021/01/07/13:36
 * @Description:项目初始化，将Spring上下文加载到缓存中
 */
@Configuration
public class CacheInit {
    private static final long serialVersionUID = 1L;
    @Autowired
    private SRInfoService srInfoService;
    @Autowired
    private DBLaunchService dbLaunchService;
    private String RH_VALIDATOR_PATH = "D:\\home\\dhcc\\zxapp\\config\\data";//临时路径
    @PostConstruct
    public void init(){
        //String RH_VALIDATOR_PATH = dbLaunchService.getPath("S_PATH_INFO_getPath", "RH_VALIDATOR_PATH");
        String pageNumber = dbLaunchService.getPath("S_PATH_INFO_getPath", "MESSAGEINFO_PAGENUMBER");
        /*start初始化人行jar缓存*/
        try {
            Loader.loadCache(RH_VALIDATOR_PATH);
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        Loader.loadValidator(RH_VALIDATOR_PATH);
        /*end初始化人行jar缓存*/

        /*start初始化人行数据字段映射缓存*/
        Cache cache = EhcacheUtil.getInstance().get("SRCache");
        List<SRInfo> singleList = srInfoService.findAll("SRInfoBoInfo_getSRInfoListSigle");
        List<SRInfo> doubleList = srInfoService.findAll("SRInfoBoInfo_getSRInfoListDouble");
        char[] a;
        for (SRInfo s : singleList) {
            Element element = new Element(s.getInfrectype().substring(0,3)+s.getXml_tag(), s);
            cache.put(element);
        }
        for (SRInfo s : doubleList) {
            Element element = new Element(s.getInfrectype().substring(0,3)+s.getXml_tag()+s.getUp_one(), s);
            cache.put(element);
        }
        /*end初始化人行数据字段映射缓存*/
    }
    @PreDestroy
    public void destroy(){
        EhcacheUtil.getInstance().destroy();
        System.out.println("CRS项目已关闭。。。。。。。。。。。。。。。。。。。");
    }
}
