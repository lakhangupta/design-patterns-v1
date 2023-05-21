package com.design.strategy.payment;

public class CreditCardStrategy implements IPaymentStrategy{

    private String name;
    private String cardnumber;
    private String cvv;
    private String expirydate;

    public CreditCardStrategy(String name, String cardnumber, String cvv, String expirydate) {
        this.name = name;
        this.cardnumber = cardnumber;
        this.cvv = cvv;
        this.expirydate = expirydate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }
}
