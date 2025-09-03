package ru.yandex.praktikum.products.model;

import static ru.yandex.praktikum.products.model.constants.Colour.RED_APPLE;
import static ru.yandex.praktikum.products.model.constants.Discount.DISCOUNT_ALL;
import static ru.yandex.praktikum.products.model.constants.Discount.DISCOUNT_RED_APPLE;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (RED_APPLE.equalsIgnoreCase(colour)) {
            return 60.0;
        }

        return 0.0;
    }
}
