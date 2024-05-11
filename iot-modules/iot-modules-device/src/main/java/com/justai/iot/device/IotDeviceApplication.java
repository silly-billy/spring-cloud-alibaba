package com.justai.iot.device;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class IotDeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotDeviceApplication.class, args);
    }

}
