package Banco;

public class GestionCuentas {
    private Banco banco;

    public GestionCuentas(Banco banco){
        this.banco = banco;
    }

    public CuentaBanco obtenerCuentaPorTitular(String titular){
        return banco.obtenerCuenta(titular);
    }


}
