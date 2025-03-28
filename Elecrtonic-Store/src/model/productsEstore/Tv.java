package model.productsEstore;

import model.Product;

public class Tv extends Product {
    public Tv(String name, float price){
        super(name, price);
    }

    @Override
    public void showDetails() {
        System.out.println("TV:   \t" + this.getName() + "\n\tPrice: " + this.getPrice());
    }
}
