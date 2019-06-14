package com.lmk.dubbointerface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DubboInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboInterfaceApplication.class, args);
    }

}
