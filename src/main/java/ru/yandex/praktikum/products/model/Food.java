package ru.yandex.praktikum.products.model;

import static ru.yandex.praktikum.products.model.constants.Colour.RED_APPLE;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    public boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    public double getTotalPrice() {
        return price * amount;
    }

    public double getTotalPriceWithDiscount() {
        return price * amount * ((100 - getDiscount()) / 100);
    }
}
