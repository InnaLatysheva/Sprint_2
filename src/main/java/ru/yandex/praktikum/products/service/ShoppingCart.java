package ru.yandex.praktikum.products.service;

import ru.yandex.praktikum.products.model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;

        for (Food food : foods) {
            totalPrice = totalPrice + food.getTotalPrice();
        }

        return totalPrice;
    }


    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Food food : foods) {
            totalPrice = totalPrice + food.getTotalPriceWithDiscount();
        }

        return totalPrice;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double vegetarianTotal = 0;
        for (Food food : foods) {
            if (food.isVegetarian) {
                vegetarianTotal = vegetarianTotal + food.getTotalPrice();
            }
        }

        return vegetarianTotal;
    }
}
