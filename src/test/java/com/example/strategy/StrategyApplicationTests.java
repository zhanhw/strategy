package com.example.strategy;

import com.alibaba.fastjson.JSON;
import com.example.strategy.builder.BaseMessageData;
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

    @Test
    void testBuilder() throws Exception {
        BaseMessageData build = BaseMessageData.builder()
                .tag("default")
                .body("参数信息")
                .messageId("messageId")
                .messageKey("messageKey").build();
        System.out.println(JSON.toJSONString(build));
    }

}
