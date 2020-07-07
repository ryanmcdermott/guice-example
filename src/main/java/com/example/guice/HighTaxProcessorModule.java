package com.example.guice;

import com.google.inject.AbstractModule;

public class HighTaxProcessorModule extends AbstractModule {

    protected void configure() {
        bind(TaxProcessor.class).to(HighTaxProcessor.class);
    }
}