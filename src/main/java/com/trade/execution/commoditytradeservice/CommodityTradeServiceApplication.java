package com.trade.execution.commoditytradeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CommodityTradeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommodityTradeServiceApplication.class, args);
	}

}
