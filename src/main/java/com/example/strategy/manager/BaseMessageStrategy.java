package com.example.strategy.manager;

import com.example.strategy.annotation.MessageHandel;
import com.example.strategy.annotation.MessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 基础测试
 *
 * @author aw
 * @date 2021/1/13 15:42
 */
@Slf4j
@Service
@MessageListener
public class BaseMessageStrategy {

    @MessageHandel(value = "default")
    public void execute(String body) {
        log.info("-------------执行了--------------- {}", body);
    }

}
