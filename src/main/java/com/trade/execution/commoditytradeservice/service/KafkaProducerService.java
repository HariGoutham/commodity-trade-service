//package com.trade.execution.commoditytradeservice.service;
//
//import com.trade.execution.commoditytradeservice.model.Trade;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaProducerService {
//
//    private static final String TRADE_TOPIC = "trade-events";
//
//    @Autowired
//    private KafkaTemplate<String, Object> kafkaTemplate;
//
//    public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
//
//    }
//
//    /**
//     * Sends a trade event to the Kafka topic.
//     *
//     * @param trade The trade object to be sent as an event.
//     */
//    public void sendTradeEvent(Trade trade) {
//        kafkaTemplate.send(TRADE_TOPIC, trade);
//    }
//}
