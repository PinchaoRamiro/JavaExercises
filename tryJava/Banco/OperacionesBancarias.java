package Banco;

import java.util.Scanner;

public class OperacionesBancarias {
  private Banco banco;
  private Scanner scanner;

  public OperacionesBancarias(Banco banco) {
    this.banco = banco;
    this.scanner = new Scanner(System.in);
  }

  private String pedirNombre(){
    System.out.println("Ingrese el nombre del titular: ");
    return scanner.next();
  }

  public void ingresarDinero(){
    System.out.println("Marque opción: \n 1. Crear cuenta \n 2. Ingresar en una cuenta existente\n");
    int option = scanner.nextInt();
    String titular = pedirNombre();

    if(option == 1){
      System.out.println("Ingrese el monto: ");
      Float saldo = scanner.nextFloat();
      CuentaBanco newCuenta = new CuentaBanco(titular, saldo);
      banco.agregarCuenta(newCuenta);
    }
    else{
      CuentaBanco cuenta = banco.obtenerCuenta(titular);
      if (cuenta != null) {     
        System.out.println("Ingrese el monto: ");
        Float saldo = scanner.nextFloat();
        cuenta.depositar(saldo);
      } else {
        System.out.println("El titular ingresado no está registrado en el banco");
      }
    }
  }

  public void retirarDinero(){
    String titular = pedirNombre();
    CuentaBanco cuenta = banco.obtenerCuenta(titular);
    if(cuenta != null){
      System.out.println("Ingrese el monto: ");
      Float monto = scanner.nextFloat();
      cuenta.retirar(monto);
    }
    else{
      System.out.println("El titular ingresado no está registrado en el banco");
    }
  }

  public void consultarSaldo(){
    String titular = pedirNombre();
    CuentaBanco cuenta = banco.obtenerCuenta(titular);
    if(cuenta != null){
      System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
    else{
      System.out.println("El titular ingresado no está registrado en el banco");
    }
  }

  public void mostrarCuentas(){
    banco.mostrarCuentas();
  }

  public void mostrarCuentasSaldoPositivo(){
    banco.obtenerCuentasConSaldoPositivo();
  }
}
