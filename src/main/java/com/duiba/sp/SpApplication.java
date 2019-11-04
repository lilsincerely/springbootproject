package com.duiba.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:/spring/UserMapper.xml" })
@ComponentScan(basePackages = {"com.duiba.sp.*"})
public class SpApplication {

    public static void main(String[] args) {
        System.out.println("main start");
        SpringApplication.run(SpApplication.class, args);
        System.out.println("main end");

    }

}
