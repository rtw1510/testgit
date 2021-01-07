package com.dhcc.xml.ent.batch.processor.motgacltalctrctinfo;

import com.dhcc.xml.ent.entity.EntDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.motgacltalctrctinfo.EnMotgaCltalCtrctInfo;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel;
import com.dhcc.xml.util.CreateXML;

/**
 * 处理类。
 */
@Component("EntMoCEntDelProcessor")
@StepScope
public class MoCEntDelProcessor implements ItemProcessor<MoCEntDel, Object> {

    /**
     * 内容处理。
     */
    public Object process(MoCEntDel moCEntDel) throws Exception {
        EntDocument entDocument = new EntDocument();
        entDocument.setMoCEntDel(moCEntDel);
//    	String reportXML = CreateXML.convertToXml(enMotgaCltalCtrctInfo) + "\r\n";
		return entDocument;
    }
}