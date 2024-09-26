package org.example.designpatterns.creational.abstactfactory.bank;

class HALKBANK implements Bank{
    private final String BNAME;
    public HALKBANK (){
        BNAME="HALKBANK";
    }
    public String getBankName(){
        return BNAME;
    }
} // End of the HALKBANK class.
