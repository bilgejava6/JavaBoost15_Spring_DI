package com.muhammet.step2;

public class Print {

    public void printMessage(MessageType type){
        switch (type) {
            case STANDART -> System.out.println("Hello World");
            case ERROR -> System.err.println("Hello World");
        }
    }
}
