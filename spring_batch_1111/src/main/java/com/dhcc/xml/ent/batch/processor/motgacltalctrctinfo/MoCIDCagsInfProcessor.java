package com.dhcc.xml.ent.batch.processor.motgacltalctrctinfo;

import com.dhcc.xml.ent.entity.EntDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.motgacltalctrctinfo.EnMotgaCltalCtrctInfo;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf;
import com.dhcc.xml.util.CreateXML;

/**
 * ¥¶¿Ì¿‡°£
 */
@Component("EntMoCIDCagsInfProcessor")
@StepScope
public class MoCIDCagsInfProcessor implements ItemProcessor<MoCIDCagsInf, Object> {

    public Object process(MoCIDCagsInf moCIDCagsInf) throws Exception {
		EntDocument entDocument = new EntDocument();
		entDocument.setMoCIDCagsInf(moCIDCagsInf);
//    	String reportXML = CreateXML.convertToXml(enMotgaCltalCtrctInfo) + "\r\n";
		return entDocument;
    }
}