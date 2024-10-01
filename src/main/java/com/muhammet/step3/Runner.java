package com.muhammet.step3;

public class Runner {
    public static void main(String[] args) {
        /**
         * Çok Biçimlilik -> Polimorphism
         * --> miras yoluyla türetilmiş sınıflar ya da interface ler
         * nesnelerin referanslarını taşıyabilir ve atanabilirler.
         */
//        Provider provider;
//        provider  = new ProviderDE();
//        System.out.println(provider.getMessage());
//        provider  = new ProviderEN();
//        System.out.println(provider.getMessage());
//        provider  = new ProviderTR();
//        System.out.println(provider.getMessage());
        // Değişkenler
        Provider provider;
        Printer printer;
        // nesneler
        provider = new ProviderDE();
        printer = new ErrorPrinter();
        // işlemler
        printer.setProvider(provider);
        printer.print();
    }
}
