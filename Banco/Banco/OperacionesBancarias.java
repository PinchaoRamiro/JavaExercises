package Banco;

import java.util.Scanner;
import java.util.List;

public class OperacionesBancarias {
  private Banco banco;
  private Scanner scanner;

  public OperacionesBancarias(Banco banco) {
    this.banco = banco;
    this.scanner = new Scanner(System.in);
  }

  private String pedirNombre(){
    System.out.println("Ingrese el nombre del titular: ");
    return scanner.nextLine();
  }

  public void ingresarDinero(){
    System.out.println("Marque opción: \n 1. Crear cuenta \n 2. Ingresar en una cuenta existente\n");
    int option = scanner.nextInt();
    scanner.nextLine();
    String titular = pedirNombre();
    System.out.println("Ingrese el monto: ");
    Float saldo = scanner.nextFloat();
    scanner.nextLine();
    
    if(option == 1){     
      CuentaBanco newCuenta = new CuentaBanco(titular, saldo);
      banco.agregarCuenta(newCuenta);
      System.out.println("La cuenta con titular: " +  titular + " y saldo " + saldo + " Fue creada");
    }
    else{
      CuentaBanco cuenta = banco.obtenerCuenta(titular);
      if (cuenta != null) {          
        cuenta.depositar(saldo);
        System.out.println("Se ingreso " + saldo);
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
      scanner.nextLine();
      Float saldo = cuenta.retirar(monto);
      if(saldo > 0) System.out.println("Su saldo actual es de: " + cuenta.getSaldo());  
      else System.out.println("No tienes el saldo suficiente: " + cuenta.getSaldo());
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
    List<CuentaBanco> cuentas = banco.obtenerCuentasConSaldoPositivo();
    cuentas.forEach(System.out::println);
  }
}
