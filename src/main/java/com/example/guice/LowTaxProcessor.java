package com.example.guice;

import com.google.inject.AbstractModule;

public class LowTaxProcessor implements TaxProcessor {
    public double calculateWithTax(double total) {
        return 1.01 * total;
    }
}
