package com.dhcc.core.cache.util;

import com.dhcc.xml.per.batch.launch.PerBatchJobExecute;
import com.dhcc.xml.service.DBLaunchService;
import com.dhcc.xml.util.SpringContextUtil;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


/**
 * Author: HuLin
 * Date: 2020/11/6 8:38
 */
public class EhcacheUtil {


//    private static final String path = "ehcache/ehcache.xml";

    private CacheManager manager;

    private static EhcacheUtil ehCache;
    /*@Autowired
    private static DBLaunchService dbLaunchService;*/

    private EhcacheUtil(String path) {
        manager = CacheManager.create(path);
    }

    public static EhcacheUtil getInstance() {
        if (ehCache == null) {
            //ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();
            //DBLaunchService dbLaunchService = applicationContext.getBean(DBLaunchService.class);
            //String path = dbLaunchService.getPath("S_PATH_INFO_getPath", "RH_VALIDATOR_PATH")+"ehcache.xml";
            String path = "D:\\home\\dhcc\\zxapp\\config\\data\\ehcache.xml";//临时路径
            ehCache = new EhcacheUtil(path);
        }
        return ehCache;
    }

    public void put(String cacheName, String key, Object value) {
        Cache cache = manager.getCache(cacheName);
        Element element = new Element(key, value);
        cache.put(element);
    }

    public Object get(String cacheName, String key) {
        Cache cache = manager.getCache(cacheName);
        Element element = cache.get(key);
        return element == null ? null : element.getObjectValue();
    }

    public Cache get(String cacheName) {
        return manager.getCache(cacheName);
    }

    public void remove(String cacheName, String key) {
        Cache cache = manager.getCache(cacheName);
        cache.remove(key);
    }

    public void destroy() {
        manager.clearAll();
//        manager.shutdown();
    }
}
