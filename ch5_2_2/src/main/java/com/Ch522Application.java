package com;

import com.qiling.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch522Application {


    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/book")
    public String index(){
        return "book name is : "+bookName+" and book author is "+bookAuthor;
    }

    @Autowired
    private Author author;

    @RequestMapping("/dzp")
    public String dzp(){
        return "author is "+author.getName()+" and author age is " + author.getAge();
    }



    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class, args);
        /*
        设置取消启动时控制台输出  spring  图案
        SpringApplication application = new SpringApplication(Ch522Application.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);*/
    }

}
