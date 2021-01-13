package com.example.strategy;

import com.example.strategy.manager.MessageStrategyCommonManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyApplicationTests {

    @Autowired
    private MessageStrategyCommonManager messageStrategyCommonManager;

    @Test
    void contextLoads() throws Exception {
        messageStrategyCommonManager.consume("default", "参数信息");
    }

}
