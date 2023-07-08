package org.example.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Фільтрація об'єктів: Створіть клас товару з полями "назва", "ціна" і "кількість".
 * Створіть список товарів і відфільтруйте його, залишивши тільки товари з ціною менше 100 грн.
 *  Результат надрукувати в консоль. Використовуйте лямбда-вирази для фільтрації.
 */
public class ProductFiltering {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Продукт 1", 50, 5));
        products.add(new Product("Продукт 2", 120, 2));
        products.add(new Product("Продукт 3", 80, 10));
        products.add(new Product("Продукт 4", 150, 3));
        products.add(new Product("Продукт 5", 90, 8));

        List<Product> filteredProducts = filterProductsByPrice(products, 100);

        System.out.println("Фільтровані товари: ");
        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }

    public static List<Product> filterProductsByPrice(List<Product> products, int price) {
        return products.stream()
                .filter(product -> product.price() < price)
                .toList();
    }
}

record Product (String name, int price, int quantity) {
}
