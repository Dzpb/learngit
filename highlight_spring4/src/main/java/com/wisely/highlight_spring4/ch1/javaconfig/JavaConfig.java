package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration      // 使用 @Configuration 注解表明当前类是一个配置类，这意味着这个类里可能有0个或多个@Bean注解，
// 此处没有使用包扫描，是因为所有的Bean都在此类中定义了
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean       // 使用 @Bean 注解声明当前方法 FunctionService 的返回值是一个Bean, bEAN的名称是方法名
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

    /*@Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }*/
}
