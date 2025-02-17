package com.trade.execution.commoditytradeservice.controller;

import com.trade.execution.commoditytradeservice.model.Trade;
import com.trade.execution.commoditytradeservice.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trades")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @PostMapping
    public ResponseEntity<Trade> placeTrade(@RequestParam String commodity,
                                            @RequestParam Double quantity,
                                            @RequestParam Double price) {
        Trade trade = tradeService.executeTrade(commodity, quantity, price);
        return ResponseEntity.ok(trade);
    }
}
