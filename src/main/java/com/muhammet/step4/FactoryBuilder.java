package com.muhammet.step4;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryBuilder implements Factory{
    private Provider provider;
    private Printer printer;
    private static FactoryBuilder instance;
    static {
        instance = new FactoryBuilder();
    }
    private FactoryBuilder(){}
    public static FactoryBuilder getInstance(){
        return instance;
    }
    private Properties properties;
    {
        properties = new Properties();
        try{
            properties.load(new FileInputStream("/Users/muhammetalikaya/BILGEADAM_DATAS/Java_Boost_15/Spring/Spring_DI/src/main/resources/application.properties"));
            String classProviderName = properties.getProperty("provider");
            String classPrinterName = properties.getProperty("printer");
            provider = (Provider) Class.forName(classProviderName).getDeclaredConstructor().newInstance();
            printer = (Printer) Class.forName(classPrinterName).getDeclaredConstructor().newInstance();
        }catch (Exception ex){
            System.out.println("Hata...: "+ ex);
        }
    }
    @Override
    public Printer getPrinter() {
        return printer;
    }

    @Override
    public Provider getProvider() {
        return provider;
    }
}
