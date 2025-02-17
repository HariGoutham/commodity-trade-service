package com.trade.execution.commoditytradeservice.repository;

import com.trade.execution.commoditytradeservice.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepository extends JpaRepository<Trade, Long> {
}
