package com.muhammet.step6_springframework;

public class ProviderTR implements Provider {
    @Override
    public String getMessage() {
        return "Hoş Geldiniz :)";
    }

    @Override
    public String getHome() {
        return "";
    }

    @Override
    public String getAbout() {
        return "";
    }
}
