package model.productsEstore;

import model.Product;


public class Computer extends Product  {
    public Computer(String name, float price){
        super(name, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Computer: " + getName() + "\n\tPrice: " + getPrice());
    }
}
