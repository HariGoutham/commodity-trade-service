//package com.trade.execution.commoditytradeservice.config;
//
//import com.trade.execution.commoditytradeservice.service.KafkaProducerService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.core.KafkaTemplate;
//
//@Configuration
//public class KafkaConfig {
//
//    @Bean
//    public KafkaProducerService kafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
//        return new KafkaProducerService(kafkaTemplate);
//    }
//}
