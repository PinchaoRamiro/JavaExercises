package ui;

import java.util.Scanner;
import store.Store;

public class FinishWindow {
  public static  void showFinish(Store store, Scanner scanner){
    store.showCart();

    System.out.println("the total of your purchase was" + store.finishPurchase());

    store.getCart().emptyCart();// clear the cart

    System.out.println("Thanks for your purchase");
    System.out.println("Press any key to back to menu");
    scanner.nextLine();
    
  }
  
}
