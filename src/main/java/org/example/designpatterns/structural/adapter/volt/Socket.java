package org.example.designpatterns.structural.adapter.volt;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
