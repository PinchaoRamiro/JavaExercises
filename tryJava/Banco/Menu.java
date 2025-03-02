package Banco;

import java.util.Scanner;

public class Menu {
  private Banco banco;
  private OperacionesBancarias operacionesBancarias;
  private GestionCuentas gestionCuentas;
  private Scanner scanner;

  public Menu(Banco banco){
    this.banco = banco;
    this.operacionesBancarias = new OperacionesBancarias(banco);
		this.gestionCuentas = new GestionCuentas(banco);
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
            case 1:
                operacionesBancarias.ingresarDinero();
                break;
            case 2:
                operacionesBancarias.retirarDinero();
                break;
            case 3:
                operacionesBancarias.consultarSaldo();
                break;
            case 4:
                operacionesBancarias.mostrarCuentas();
                break;
            case 5:
                operacionesBancarias.mostrarCuentasSaldoPositivo();
                break;
            case 6:
                continuar = false;
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
  }
}
