package com.muhammet.step5;

public class Runner {
    public static void main(String[] args) {
        Printer printer = MuhammetFremwork.INSTANCE
                            .getPrinter("com.muhammet.step5.ErrorPrinter",
                                    "com.muhammet.step5.ProviderEN");
        printer.print();
    }
}
