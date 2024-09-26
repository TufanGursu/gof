package org.example.designpatterns.creational.abstactfactory.bank;

class ISBANK implements Bank{
    private final String BNAME;
    ISBANK (){
        BNAME="ISBANK";
    }
    public String getBankName() {
        return BNAME;
    }
}  // End of the ISBANK class.
