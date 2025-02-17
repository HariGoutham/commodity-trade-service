package com.trade.execution.commoditytradeservice.service;

import com.trade.execution.commoditytradeservice.model.Trade;
import com.trade.execution.commoditytradeservice.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TradeService {
    @Autowired
    private TradeRepository tradeRepository;

    @Autowired
    private MarketPriceService marketPriceService;

//    @Autowired
//    private KafkaProducerService kafkaProducerService;

    public Trade executeTrade(String commodity, Double quantity, Double price) {
        //Double marketPrice = marketPriceService.getCurrentMarketPrice(commodity);
        Double marketPrice = 1950.7;
        if (isPriceWithinRange(price, marketPrice)) {
            Trade trade = new Trade();
            trade.setCommodity(commodity);
            trade.setQuantity(quantity);
            trade.setPrice(price);
            trade.setTimestamp(LocalDateTime.now());
            trade.setStatus("VALID");
            tradeRepository.save(trade);
//            kafkaProducerService.sendTradeEvent(trade);
            return trade;
        } else {
            throw new IllegalArgumentException("Price exceeds market range");
        }
    }

    private boolean isPriceWithinRange(Double tradePrice, Double marketPrice) {
        double range = marketPrice * 0.05;
        return (tradePrice >= (marketPrice - range)) && (tradePrice <= (marketPrice + range));
    }
}
