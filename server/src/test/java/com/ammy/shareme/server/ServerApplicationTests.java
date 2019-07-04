package com.ammy.shareme.server;

import com.ammy.shareme.server.util.ConstConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

    Logger logger = LoggerFactory.getLogger(ServerApplicationTests.class);

    @Autowired
    ConstConfig config;

    @Test
    public void contextLoads() {
        System.out.println(config.toString());
    }

}
