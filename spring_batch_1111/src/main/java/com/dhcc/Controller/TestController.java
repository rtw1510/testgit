package com.dhcc.Controller;

import com.dhcc.xml.per.batch.launch.PerBatchJobExecute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private PerBatchJobExecute perBatchJobExecute;
    @RequestMapping("/test")
    public String exe(){
        perBatchJobExecute.run("","00000","","1");
        return "SUCCESS";
    }
}
