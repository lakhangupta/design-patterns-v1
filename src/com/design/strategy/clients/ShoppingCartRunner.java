package com.design.strategy.clients;

import com.design.strategy.payment.CreditCardStrategy;
import com.design.strategy.payment.Item;
import com.design.strategy.payment.PaypalStrategy;
import com.design.strategy.payment.ShoppingCart;

// this is a basic shopping cart example by strategy pattern

public class ShoppingCartRunner {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal (define the strategy, we want to use. As i used here paypalstrategy which will use only paypal payment method)
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));

    }
}
