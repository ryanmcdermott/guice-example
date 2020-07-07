package com.example.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(final String[] args) {
        double[] prices = { 5.0, 10.0, 20.0 };

        final Injector injectorHighTax = Guice.createInjector(new HighTaxProcessorModule());
        ShoppingCart shoppingCart = injectorHighTax.getInstance(ShoppingCart.class);
        System.out.println("\nHighTaxProcessor injection example: \n");
        System.out.println(shoppingCart.calculateTotal(prices));

        final Injector injectorLowTax = Guice.createInjector(new LowTaxProcessorModule());
        shoppingCart = injectorLowTax.getInstance(ShoppingCart.class);
        System.out.println("\nLowTaxProcessor injection example: \n");
        System.out.println(shoppingCart.calculateTotal(prices));
    }
}