package org.example.designpatterns.creational.abstactfactory.bank;

class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("AKBANK")){
            return new AKBANK();
        } else if(bank.equalsIgnoreCase("ISBANK")){
            return new ISBANK();
        } else if(bank.equalsIgnoreCase("HALKBANK")){
            return new HALKBANK();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}//End of the BankFactory class.
