package com.dhcc.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: rtw
 * @Date: 2021/01/07/11:22
 * @Description:
 */
@Component
public class Testqd  implements DisposableBean, ExitCodeGenerator {
    public Testqd() {
        System.out.println("创建");
    }

    @PostConstruct
    public void Test1(){
        System.out.println("项目初始化。。。");
    }
    @Override
    public int getExitCode() {
        return 5;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("<<<<<<<<<<<我被销毁了......................>>>>>>>>>>>>>>>");
    }
}
