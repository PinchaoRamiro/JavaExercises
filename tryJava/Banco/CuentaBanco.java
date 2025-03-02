package Banco;

public class CuentaBanco {
    String titular;
    Float saldo;

    public CuentaBanco(String titular, Float saldo){
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public Float getSaldo(){
        return saldo;
    }

    // Este metodo retorna el saldo actual si la operación fue exitosa, en caso contrario retorna -1.0
    public Float depositar(Float monto){
        if(monto > 0){
            saldo += monto;
            return saldo;
        }else{
            return -1.0f;
        }
    }

    // Este metodo retorna el saldo actual si la operación fue exitosa, en caso contrario retorna -1.0
    public Float retirar(Float monto){
        if(monto > 0 && monto <= saldo){
            saldo -= monto;
            return saldo;
        }else{
            return -1.0f;
        }
    }

    @Override
    public String toString(){
        return "Titular:" + titular + "\nSaldo: " + saldo;
    }
}
