package com.dhcc.xml.per.batch.writer;

import com.dhcc.xml.per.entity.baseinfo.db.Pb_CustBase_Info;
import com.dhcc.xml.util.CreateXML;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

@Deprecated
@Configuration
public class TestWriter {
    @Bean
    @StepScope
    public FlatFileItemWriter<Pb_CustBase_Info> fileItemWriter(@Value("#{stepExecutionContext[fromId]}")String fromId,
                                                               @Value("#{stepExecutionContext[toId]}") String toId) throws Exception {
        FlatFileItemWriter<Pb_CustBase_Info> writer = new FlatFileItemWriter<>();
        String path = "d:\\test\\" + "-" +fromId + "-" + toId + ".text";
        writer.setResource(new FileSystemResource(path));
        writer.setLineAggregator(new LineAggregator<Pb_CustBase_Info>() {
            @Override
            public String aggregate(Pb_CustBase_Info pb_custBase_info) {
                String xml = CreateXML.convertToXml(pb_custBase_info);
                return xml;
            }
        });
        //writer.afterPropertiesSet();
        return writer;
    }

}