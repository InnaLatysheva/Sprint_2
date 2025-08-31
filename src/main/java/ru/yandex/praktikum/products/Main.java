package ru.yandex.praktikum.products;

import ru.yandex.praktikum.products.model.Apple;
import ru.yandex.praktikum.products.model.Food;
import ru.yandex.praktikum.products.model.Meat;
import ru.yandex.praktikum.products.service.ShoppingCart;
import static ru.yandex.praktikum.products.model.constants.Colour.RED_APPLE;
import static ru.yandex.praktikum.products.model.constants.Colour.GREEN_APPLE;
public class Main {
    public static void main(String[] args) {

        Food[] foods = {
                new Meat(5, 100),
                new Apple(10, 50, RED_APPLE),
                new Apple(8, 60, GREEN_APPLE)
        };

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalPrice() + " руб.");

        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.getTotalPriceWithDiscount() + " руб.");

        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getTotalPriceIsVegetarian() + " руб.");
    }
}