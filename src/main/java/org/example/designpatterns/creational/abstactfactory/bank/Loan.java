package org.example.designpatterns.creational.abstactfactory.bank;

abstract class Loan{
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double loanamount, int years)
    {
        /*
              to calculate the monthly loan payment i.e. EMI

              rate=annual interest rate/12*100;
              n=number of monthly installments;
              1year=12 months.
              so, n=years*12;

            */
        /*
        kredi tutarı*(faiz*(1+faiz) taksit sayısı/(1+faiz) taksit sayısı-1)
         */

        double EMI;
        int n;

        n=years*12;
        rate=rate/1200;
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount "+loanamount+" you have borrowed");
        //An equated monthly installment (EMI) is a fixed payment amount made by a borrower to a lender at a specified date each calendar month
    }
}// end of the Loan abstract class.