package com.francisco.kafka;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    private static final Log log = LogFactory.getLog(Consumer.class);

    @KafkaListener(topics = "demo-topic", groupId = "demo-group")
    public void listen(String message) {
        log.info("Received: " + message);
    }
}
