package org.example.designpatterns.creational.abstactfactory.bank;

class AKBANK implements Bank{
    private final String bname;
    public AKBANK (){
        bname="AKBANK";
    }
    public String getBankName() {
        return bname;
    }
}
