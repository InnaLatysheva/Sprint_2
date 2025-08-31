package ru.yandex.praktikum.products.service;

import ru.yandex.praktikum.products.model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Food food : foods) {
            totalPrice = totalPrice + food.getTotalPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPriceWithDiscount = 0;
        for (Food food : foods) {
            totalPriceWithDiscount = totalPriceWithDiscount + food.getTotalPriceWithDiscount();
        }
        return totalPriceWithDiscount;
    }

    public double getTotalPriceIsVegetarian() {
        double totalPriceIsVegetarian = 0;
        for (Food food : foods) {
            totalPriceIsVegetarian = totalPriceIsVegetarian + food.getTotalPriceIsVegetarian();
        }
        return totalPriceIsVegetarian;
    }
}