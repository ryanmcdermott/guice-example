package com.example.guice;

import com.google.inject.Inject;

public class ShoppingCart {
    private TaxProcessor taxProcessor;

    @Inject
    public ShoppingCart(TaxProcessor taxProcessor) {
        this.taxProcessor = taxProcessor;
    }

    public double calculateTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }

        return this.taxProcessor.calculateWithTax(total);
    }
}