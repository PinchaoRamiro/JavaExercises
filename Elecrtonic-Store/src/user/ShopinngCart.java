package user;

import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ShopinngCart {
  List<Product> products;

  public ShopinngCart(){
    this.products = new ArrayList<>();
  }

  public void addProduct(Product product){
    products.add(product);
  }

  public void showProducts(){
    int index = 1;
    for(Product product : products){
      System.out.print((index++) + ".\t");
      product.showDetails();
    }
  }

  public Boolean removeProduct(int index){
    if(index >= 0 && index < products.size()){
      products.remove(index);
      return true;
    }

    return false;
  }

  public float checkout(){
    float total = 0;
    for(Product product : products){
      total += product.getPrice();
    }
    return total;
  }

  public int numberOfProducts(){
    return products.size();
  }

  public void emptyCart(){
    products.clear();
  }

  
}
