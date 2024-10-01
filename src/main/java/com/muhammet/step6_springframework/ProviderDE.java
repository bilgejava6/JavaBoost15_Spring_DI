package com.muhammet.step6_springframework;

public class ProviderDE implements Provider {
    @Override
    public String getMessage() {
        return "Wilkommen";
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
