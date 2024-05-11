package com.justai.server.provider;

import com.justai.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author xuming
 * @data 2024-05-10 17:13
 */
@DubboService
public class DemoServerImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello word";
    }
}
