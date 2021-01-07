package com.dhcc.xml.per.batch.writer;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
@Deprecated
@Component("a")
@StepScope
public class Testw implements ItemWriter<Object> {

    private @Value("#{stepExecutionContext[fromId]}")String a;

    @Override
    public void write(List<?> list) throws Exception {
        for (Object a:list){
            System.err.println(a);
        }
    }
}
