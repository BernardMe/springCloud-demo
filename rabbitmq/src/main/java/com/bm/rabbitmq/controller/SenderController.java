package com.bm.rabbitmq.controller;

import com.bm.rabbitmq.entity.UserEntity;
import com.bm.rabbitmq.servive.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {


    @Autowired
    private Sender sender;

    /**
     * 发送信息 /send?id=123&name=windows
     * @param userEntity
     * @return
     */
    @RequestMapping("/send")
    public String send(UserEntity userEntity) {
        sender.send(userEntity);
        return userEntity.toString();
    }
}
