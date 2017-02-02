package com.lou.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/1/15.
 * 监听hello通道队列
 */
@Component
@RabbitListener(queues = "log")
public class Receiver {

    @RabbitHandler
    public void process(String context){
        System.out.println("Receiver: "+ context);
    }
}
