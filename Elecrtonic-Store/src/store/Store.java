package store;

import java.util.ArrayList;
import java.util.List;
import model.Product;
import user.ShopinngCart;

public class Store {
    List<Product> products = new ArrayList<>();
    ShopinngCart cart = new ShopinngCart();

    public ShopinngCart getCart(){
        return cart;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public int numberOfProductsStore(){
        return products.size();
    }

    public void showProducts(){
        int index = 1;
        for(Product product : products){
            System.out.print((index++) + ".\t");
            product.showDetails();
        }
    }

    public void addToCart(int index){
        Product product = products.get(index);
        cart.addProduct(product);
    }

    public Boolean removeFromCart(int index){
        return cart.removeProduct(index);
    }

    public void showCart(){
        cart.showProducts();
    }

    public float finishPurchase(){
       return cart.checkout();
    }
}
