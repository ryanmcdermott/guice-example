package com.example.guice;

public class HighTaxProcessor implements TaxProcessor {
    public double calculateWithTax(double total) {
        return 1.15 * total;
    }
}
