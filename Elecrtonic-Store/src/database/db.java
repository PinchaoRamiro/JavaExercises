package database;

import model.productsEstore.Computer;
import model.productsEstore.Movil;
import model.productsEstore.Tv;
import model.productsEstore.WMachine;
import store.Store;

public class db {
    public void conect(Store store){
        store.addProduct(new Tv("Samsung Tv", 1000));
        store.addProduct(new WMachine("LG", 500));
        store.addProduct(new Tv("Sony", 1500));
        store.addProduct(new WMachine("Whirlpool", 600));
        store.addProduct(new Tv("Panasonic", 1200));
        store.addProduct(new WMachine("Samsung", 700));
        store.addProduct(new Movil("Motorola", 300));
        store.addProduct(new Movil("Samsung", 400));
        store.addProduct(new Computer("HP", 900));
        store.addProduct(new Computer("Dell", 800));
        store.addProduct(new Computer("Apple", 2000));
        store.addProduct(new WMachine("Whirlpool", 600));
    }
}
