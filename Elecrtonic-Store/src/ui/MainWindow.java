package ui;

import java.io.IOException;
import java.util.Scanner;
import store.Store;

public class MainWindow {
  Scanner scanner = new Scanner(System.in);

  public void initStore(Store store){
    MenuStore.showMenu();
    int option = scanner.nextInt();
    scanner.nextLine();

    while(option != 4){
      switch (option) {
        case 1 -> ShowProducts.showProductsS(store, scanner, this::cleanConsole);
        case 2 -> Cart.showCart(store, this::cleanConsole, scanner);
        case 3 -> FinishWindow.showFinish(store, scanner);
        default -> {
            System.out.println("Invalid option. Please try again.");
            System.out.println("Press any key to continue");
            scanner.nextLine();
        }
      }
      cleanConsole();
      MenuStore.showMenu();
      option = scanner.nextInt();
      scanner.nextLine();
    }
    System.out.println("Thanks for your visit");
  }
  public void cleanConsole() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } catch (InterruptedException | IOException e) {
        System.err.println("An error occurred while trying to clear the console: " + e.getMessage());
    }
  }

}
