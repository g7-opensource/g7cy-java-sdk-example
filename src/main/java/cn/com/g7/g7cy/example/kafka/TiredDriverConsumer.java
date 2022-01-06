package cn.com.g7.g7cy.example.kafka;

import cn.com.g7.sdk.kafka.bo.IotEvent;
import cn.com.g7.sdk.kafka.bo.KafkaData;
import cn.com.g7.sdk.kafka.consumer.AbstractTiredDriverConsumer;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 司机疲劳事件
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/16 3:54 下午
 */
@Component
public class TiredDriverConsumer extends AbstractTiredDriverConsumer {

    private final Logger log = LoggerFactory.getLogger(TiredDriverConsumer.class);

    @Override
    public void process(KafkaData<IotEvent> kafkaData) {
        log.info("kafka data:{}", JSON.toJSONString(kafkaData));
    }
}
