package com.trade.execution.commoditytradeservice.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MarketPriceService {

    // Mock market prices for demonstration
    private final Map<String, Double> marketPrices = new HashMap<>();

    public MarketPriceService() {
        // Initialize mock market prices
        marketPrices.put("Natural Gas", 52.0);
        marketPrices.put("Green Hydrogen", 100.0);
        marketPrices.put("Wind Energy", 80.0);
    }

    /**
     * Fetches the current market price for a given commodity.
     *
     * @param commodity The name of the commodity (e.g., "Natural Gas").
     * @return The current market price.
     * @throws IllegalArgumentException If the commodity is not found.
     */
    public Double getCurrentMarketPrice(String commodity) {
        if (!marketPrices.containsKey(commodity)) {
            throw new IllegalArgumentException("Commodity not found: " + commodity);
        }
        return marketPrices.get(commodity);
    }
}
