package com.design.strategy.payment;

public class PaypalStrategy implements IPaymentStrategy{

    private String emailId;
    private String pwd;

    public PaypalStrategy(String emailId, String pwd) {
        this.emailId = emailId;
        this.pwd = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
