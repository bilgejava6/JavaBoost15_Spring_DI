package com.muhammet.step6_springframework;

public class ErrorPrinter implements Printer {
    private Provider provider;
    @Override
    public void print() {
        System.err.println(provider.getMessage());
    }

    @Override
    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
