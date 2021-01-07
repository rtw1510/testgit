package com.dhcc.xml.per.batch.processor.motgacltalctrctinfo;

import com.dhcc.xml.per.entity.PerDocument;
import org.springframework.batch.item.ItemProcessor;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.PerMotgaCltalCtrctInfo;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCEntDel;
import com.dhcc.xml.util.CreateXML;
import org.springframework.stereotype.Component;

/**
 * 处理类。
 */
@Component("PerMoCEntDel_Processor")
public class MoCEntDelProcessor implements ItemProcessor<MoCEntDel, Object> {

    /**
     * 内容处理。
     */
    public Object process(MoCEntDel moCEntDel) throws Exception {
        PerDocument perDocument = new PerDocument();
        perDocument.setMoCEntDel(moCEntDel);
//    	String reportXML = CreateXML.convertToXml(perMotgaCltalCtrctInfo) + "\r\n";
		return perDocument;
    }
}