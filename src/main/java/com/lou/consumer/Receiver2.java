package com.lou.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/2/16.
 */
@Component
@RabbitListener(queues = "log")
public class Receiver2 {
    @RabbitHandler
    public void process(String context) {
        JSONObject object = JSON.parseObject(context);
        System.out.println("Receiver2: " + context);
    }
}
