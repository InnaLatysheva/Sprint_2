package ru.yandex.praktikum.products.model;

import static ru.yandex.praktikum.products.model.constants.Colour.RED_APPLE;
public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    String colour;
    @Override
    public double getDiscount() {
        return 0;
    }

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getTotalPrice() {
        return price * amount;
    }

    public double getTotalPriceIsVegetarian() {
        if (isVegetarian) {
            return getTotalPriceIsVegetarian();
        }
        return 0;
    }

    public double getTotalPriceWithDiscount() {
        if (this.colour.equals(RED_APPLE)) {
            return getTotalPriceWithDiscount();
        }
        return 0;
    }
}
