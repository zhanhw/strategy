package com.example.strategy.manager;

import com.example.strategy.model.MessageStrategyInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 通用执行
 *
 * @author aw
 * @date 2021/1/13 17:35
 */
@Slf4j
@Service
public class MessageStrategyCommonManager {

    @Autowired
    private final Map<String, MessageStrategyInfo> messageStrategyMap = new ConcurrentHashMap<>();

    /**
     * 通用消费
     *
     * @param key
     * @throws Exception
     */
    public void consume(String key, String body) throws Exception {
        MessageStrategyInfo messageStrategyInfo = messageStrategyMap.get(key);
        if (Objects.isNull(messageStrategyInfo)) {
            log.info("没有找到该类:{}", key);
            return;
        }
        //得到类字节码对象-加载该类进内存
        Class<?> messageClass = Class.forName(messageStrategyInfo.getClassname());
        //调用方法
        Method declaredMethod = messageClass.getDeclaredMethod(messageStrategyInfo.getMethodName(), messageStrategyInfo.getParameterTypes());
        //得到对象
        Object o = messageClass.newInstance();
        //执行
        declaredMethod.invoke(o, body);
    }

}
