package modulo3;

public class Comprar {
    int saldo;
    int totalPagar;

    // Constructor
    public Comprar(int saldo, int totalPagar) {
        this.saldo = saldo;
        this.totalPagar = totalPagar;
    }

    public void comprobar() {
        try {
            verificarSaldo();
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void verificarSaldo() {
        if (saldo < totalPagar) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la compra.");
        }else{
          System.out.println("Compra realizada");
          saldo -= totalPagar;
        }
    }

    public static class SaldoInsuficienteException extends RuntimeException {
        public SaldoInsuficienteException(String mensaje) {
            super(mensaje);
        }
    }
}
