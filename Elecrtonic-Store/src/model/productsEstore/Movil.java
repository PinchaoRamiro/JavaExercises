package model.productsEstore;

import model.Product;

public class Movil extends Product {

    public Movil(String name, float price){
        super(name, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Movil:\t" + getName() + "\n\tPrice: " + getPrice());
    }

}
