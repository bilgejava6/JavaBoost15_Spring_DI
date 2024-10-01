package com.muhammet.step5;

/**
 * Programcılar için nesne üretirken aslında hangi nesnenin
 * hangi bağımlılıklarının olduğunu bilir ve iglili referansları
 * nesnelere parametre olarak geçebilir.
 */
public class MuhammetFremwork {
    private Provider provider;
    private Printer printer;
    private MuhammetFremwork(){}
    public static final MuhammetFremwork INSTANCE;
    static {
        INSTANCE = new MuhammetFremwork();
    }
    public Printer getPrinter(String printerClassName, String providerClassName){
        Object clazz_1=null;
        Object clazz_2=null;
        try{
            clazz_1 = Class.forName(printerClassName).getDeclaredConstructor().newInstance();
            clazz_2 = Class.forName(providerClassName).getDeclaredConstructor().newInstance();
        }catch (Exception exception){
            System.out.println("Beklenmeyen hata...: "+ exception);
        }
        if(clazz_1 instanceof Printer){
            printer = (Printer) clazz_1;
            provider = (Provider) clazz_2;
        }else{
            printer = (Printer) clazz_2;
            provider = (Provider) clazz_1;
        }
        printer.setProvider(provider);
        return printer;
    }
}
