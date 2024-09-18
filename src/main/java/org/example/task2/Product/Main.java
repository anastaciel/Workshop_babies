package org.example.task2.Product;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Помидоры", 85);
        Product product2 = new Product("Картошка", 25);
        Product product3 = new Product("Яблоки", 60);

        PriceList priceList = new PriceList();
        priceList.addProduct(product1);
        priceList.addProduct(product2);
        priceList.addProduct(product3);

        System.out.println(priceList.toString());
        priceList.changePrice("Помидоры", 100);

        System.out.println(priceList.toString());

        priceList.getPriceByName("Картошка");
    }

}
