package org.example.task2.Product;

import java.util.HashMap;

public class PriceList {

    private HashMap<String, Double> priceList;

    public PriceList() {
        this.priceList = new HashMap<String, Double>();
    }

    public void addProduct(Product product) {
        this.priceList.put(product.getName(), product.getPrice());

    }

    public void changePrice(String name, double price) {
        if (priceList.containsKey(name)) {
            this.priceList.put(name, price);
        }
    }

    public void getPriceByName(String name) {
        if (priceList.containsKey(name)) {
            double value = priceList.get(name);
            System.out.println("Цена товара " + name + " - " + value);
        }
    }

    @Override
    public String toString() {
        return "PriceList{" +
                "priceList=" + priceList +
                '}';
    }
}
