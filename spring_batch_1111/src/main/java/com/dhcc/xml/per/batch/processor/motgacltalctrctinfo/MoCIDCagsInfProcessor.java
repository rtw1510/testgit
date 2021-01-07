package com.dhcc.xml.per.batch.processor.motgacltalctrctinfo;

import com.dhcc.xml.per.entity.PerDocument;
import org.springframework.batch.item.ItemProcessor;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.PerMotgaCltalCtrctInfo;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCIDCagsInf;
import com.dhcc.xml.util.CreateXML;
import org.springframework.stereotype.Component;

/**
 * ¥¶¿Ì¿‡°£
 */
@Component("PerMoCIDCagsInf_Processor")
public class MoCIDCagsInfProcessor implements ItemProcessor<MoCIDCagsInf, Object> {

    public Object process(MoCIDCagsInf moCIDCagsInf) throws Exception {
		PerDocument perDocument = new PerDocument();
		perDocument.setMoCIDCagsInf(moCIDCagsInf);
//    	String reportXML = CreateXML.convertToXml(perMotgaCltalCtrctInfo) + "\r\n";
		return perDocument;
    }
}