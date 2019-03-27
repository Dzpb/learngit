package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration                                              // 声明当前类是一个配置类
@ComponentScan("com.wisely.highlight_spring4.ch1.di")
// 使用 @ComponentScan，自动扫描包名下所有使用 @Service、@Component、@Respository 和 @Controller 的类，并注册为 Bean
public class DiConfig {

}
