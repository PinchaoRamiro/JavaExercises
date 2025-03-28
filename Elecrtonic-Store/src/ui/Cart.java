package ui;

import java.util.Scanner;
import store.Store;

public class Cart {
  public static void showCart(Store store, Runnable cleanConsole, Scanner scanner){
    cleanConsole.run();
    System.out.println("Cart\n");
    if(store.getCart().numberOfProducts() == 0){
      System.out.println("Cart is empty");
    }else{
      System.out.println("Cart has " + store.getCart().numberOfProducts() + " products");
      store.showCart();
      System.out.println("Total value of your purchase: " + store.getCart().checkout());
    }

    int option;

    if(store.getCart().numberOfProducts() == 0) {
      System.out.println("Press any key to back");
      scanner.nextLine();
      return;
    }

    do{
      System.out.println("1. Remove product from cart");
      System.out.println("2. Go back");
      System.out.print("Choose an option: ");
      option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
        case 1 -> {
          cleanConsole.run();
          deleteProduct(scanner, store, cleanConsole);
        }
        case 2 -> {
          return;
        }
        default -> System.out.println("Invalid option");
      }
    }while(option != 2);
  }

  public static  void deleteProduct(Scanner scanner, Store store, Runnable cleanConsole){
    boolean removed = false;
    do { 
      store.showCart();
      System.out.print("Enter the number of the product you want to remove or 0 for back: ");
      int index = scanner.nextInt();
      scanner.nextLine();

      if(index == 0) return; 

      if(store.removeFromCart(index - 1)){
        System.out.println("Product removed successfully");
      }else{
        System.out.println("Invalid product number, press any key");
        scanner.nextLine();
        cleanConsole.run();
      }
    } while (!removed);
  }
  
}
