package cn.com.g7.g7cy.example.kafka;

import cn.com.g7.sdk.kafka.bo.IotMsgStatus;
import cn.com.g7.sdk.kafka.bo.KafkaData;
import cn.com.g7.sdk.kafka.consumer.AbstractIotMsgStatusVoiceConsumer;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 语音下发状态消息
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/16 3:54 下午
 */
@Component
public class IotMsgStatusVoiceConsumer extends AbstractIotMsgStatusVoiceConsumer {

    private final Logger log = LoggerFactory.getLogger(IotMsgStatusVoiceConsumer.class);

    @Override
    public void process(KafkaData<IotMsgStatus> kafkaData) {
        log.info("kafka data:{}", JSON.toJSONString(kafkaData));
    }
}
