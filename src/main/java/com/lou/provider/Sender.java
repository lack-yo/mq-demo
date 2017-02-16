package com.lou.provider;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/15.
 */

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 创建一个routingKey为log的队列
     */
    public void send(){
        Map map = new HashMap<>();
        map.put("logId", "lg1");
        map.put("logCount", "10");
        map.put("logChannel", "mq");
        String context = JSON.toJSONString(map);
        //convertAndSend(routingKey,object)
        this.amqpTemplate.convertAndSend("log", context);
    }
}
