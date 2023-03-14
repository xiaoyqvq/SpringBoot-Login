package com.yan.helloword.Service.impl;

import com.yan.helloword.Service.RabbitMQService;
import com.yan.helloword.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RabbitMQServiceImpl implements RabbitMQService {

    //日期格式化
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Resource
    private RabbitTemplate rabbitTemplate;
    @Override
    public String sendMsg(String msg) throws Exception{
        try {
            String msgId = UUID.randomUUID().toString().replace("-", "").substring(0, 32);
            String sendTime = sdf.format(new Date());
            Map<String, Object> map = new HashMap<>();
            map.put("msgId", msgId);
            map.put("sendTime", sendTime);
            map.put("msg", msg);
            rabbitTemplate.convertAndSend(RabbitMqConfig.TEST_FANOUT_EXCHANGE, RabbitMqConfig.DIRECT_ROUTINGKEY, map);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
