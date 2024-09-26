package org.example.designpatterns.structural.adapter.creditcard;

//This is the client class.
public class AdapterPatternDemo {
    public static void main(String[] args){
        CreditCard targetInterface=new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}//End of the BankCustomer class.

/*
+-------------------+       +-------------------+       +-------------------+
|   CreditCard      |<------|   BankCustomer    |<------|   BankDetails     |
|-------------------|       |-------------------|       |-------------------|
|+ giveBankDetails()|       |+ giveBankDetails()|       |+ getBankName()    |
|+ getCreditCard()  |       |+ getCreditCard()  |       |+ setBankName()    |
|                   |       |                   |       |+ getAccHolderName()|
|                   |       |                   |       |+ setAccHolderName()|
|                   |       |                   |       |+ getAccNumber()    |
|                   |       |                   |       |+ setAccNumber()    |
+-------------------+       +-------------------+       +-------------------+

 */