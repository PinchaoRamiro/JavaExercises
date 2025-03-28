package Banco;

import java.util.Scanner;

public class Menu {
//   private final Banco banco;
  private final OperacionesBancarias operacionesBancarias;
//   private final GestionCuentas gestionCuentas;
  private final Scanner scanner;

  public Menu(Banco banco){
    // this.banco = banco;
    this.operacionesBancarias = new OperacionesBancarias(banco);
	// this.gestionCuentas = new GestionCuentas(banco);
	this.scanner = new Scanner(System.in);
  }

  public void mostrarMenu() {
    boolean continuar = true;

    while (continuar) {
        System.out.println("\nSelecciona una opción:");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Mostrar todas las cuentas");
        System.out.println("5. Mostrar cuentas con saldo positivo");
        System.out.println("6. Salir");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        switch (opcion) {
            case 1 -> operacionesBancarias.ingresarDinero();
            case 2 -> operacionesBancarias.retirarDinero();
            case 3 -> operacionesBancarias.consultarSaldo();
            case 4 -> operacionesBancarias.mostrarCuentas();
            case 5 -> operacionesBancarias.mostrarCuentasSaldoPositivo();
            case 6 -> {
                continuar = false;
                System.out.println("¡Hasta luego!");
            }
            default -> System.out.println("Opción no válida.");
        }
    }
  }
}
