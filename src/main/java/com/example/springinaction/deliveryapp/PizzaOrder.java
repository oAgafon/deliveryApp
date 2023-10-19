package com.example.springinaction.deliveryapp;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private String clientName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryZip;
    private String creditCardNumber;
    private String creditCardExpiration;
    private String getCreditCardCVV;
    private List<Pizza> pizzaList = new ArrayList<>();
    public void addPizzd(Pizza pizza){
        this.pizzaList.add(pizza);
    }
}
