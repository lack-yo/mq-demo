package com.lou.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        String context = "msg";
        System.out.println("Sender: " + context);
        this.amqpTemplate.convertAndSend("log", context);
    }
}
