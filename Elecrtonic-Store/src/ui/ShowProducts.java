package ui;

import java.util.Scanner;
import store.Store;

public class ShowProducts {

    public static void showProductsS(Store store, Scanner scanner, Runnable cleanConsole) {
        int option;
        
        do {
            cleanConsole.run();
            showProductAndMessage(store);

            option = scanner.nextInt();
            scanner.nextLine(); 

            if (option > 0 && option <= store.numberOfProductsStore()) {
                store.addToCart(option - 1);
                System.out.println("Product added to cart.");
            } else if (option != 0) {
                System.out.println("Invalid option. Please try again.");
                System.out.println("Press any key to continue");
                scanner.nextLine();
            }

        } while (option != 0);
    }

    private static void showProductAndMessage(Store store) {
        System.err.println("Welcome to the store");
        System.out.println("Available products:");
        store.showProducts();
        System.out.println("\nSelect a product to add to the cart.");
        System.out.println("Press 0 to go back to the main menu.\n");

        if(store.getCart().numberOfProducts() > 0) {
            System.out.println("Cart has " + store.getCart().numberOfProducts() + " products");
            System.out.println("total value of your purchase: " + store.getCart().checkout());
            System.out.println("\n");
        }

        System.out.print("Option: ");
    }
}
