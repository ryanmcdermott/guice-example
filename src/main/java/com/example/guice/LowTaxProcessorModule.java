package com.example.guice;

import com.google.inject.AbstractModule;

public class LowTaxProcessorModule extends AbstractModule {

    protected void configure() {
        bind(TaxProcessor.class).to(LowTaxProcessor.class);
    }
}