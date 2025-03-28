package model.productsEstore;

import model.Product;

public class WMachine extends Product{
    public WMachine(String name, float price){
        super(name, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Wmachine: " + this.getName() + "\n\tPrice: " + this.getPrice());
    }
}
