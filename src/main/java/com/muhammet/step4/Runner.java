package com.muhammet.step4;

public class Runner {
    public static void main(String[] args) {

        // FactoryBuilder fb = new FactoryBuilder();
        FactoryBuilder fb = FactoryBuilder.getInstance();
        Printer printer = fb.getPrinter();
        Provider provider= fb.getProvider();
        printer.setProvider(provider);
        printer.print();
    }
}
