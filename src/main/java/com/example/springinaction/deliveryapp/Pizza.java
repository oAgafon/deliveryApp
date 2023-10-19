package com.example.springinaction.deliveryapp;

import lombok.Data;

import java.util.List;

@Data
public class Pizza {
    private String name;
    private List<Ingredient> ingredientList;
}
