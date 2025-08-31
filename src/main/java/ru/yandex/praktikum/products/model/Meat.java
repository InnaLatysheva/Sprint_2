package ru.yandex.praktikum.products.model;

public class Meat extends Food {
    @Override
    public double getDiscount() {
        return 0;
    }
    public Meat (int amount, double price) {
        super(amount, price, false);
    }
}
