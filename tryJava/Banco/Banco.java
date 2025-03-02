package Banco;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

    private List<CuentaBanco> listaCuentas = new ArrayList<>();

    public Banco(){
        this.listaCuentas = new ArrayList<>();
    }

    // Metodos
    public void agregarCuenta(CuentaBanco cuenta){
        listaCuentas.add(cuenta);
    }


    public CuentaBanco obtenerCuenta(String titular){
        CuentaBanco cuentaTitular = listaCuentas.stream().
            filter(element -> element.getTitular().equals(titular)).
            findFirst().
            orElse(null);

        return cuentaTitular;
    }

    public void mostrarCuentas(){
        listaCuentas.forEach(System.out::println);
    }

    public List<CuentaBanco> obtenerCuentasConSaldoPositivo() {
        List<CuentaBanco> cuentas = listaCuentas.stream()
                .filter(element -> element.getSaldo() > 0)
                .collect(Collectors.toList());

        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas con saldo positivo");
        } else {
            cuentas.forEach(System.out::println);
        }

        return cuentas;
    }

    public void llenarDatos(){
        listaCuentas.add(new CuentaBanco("Juan Pérez", 2935.45f));
        listaCuentas.add(new CuentaBanco("Ana Gómez", 4571.23f));
        listaCuentas.add(new CuentaBanco("Carlos López", 3621.56f));
        listaCuentas.add(new CuentaBanco("María Rodríguez", 2049.89f));
        listaCuentas.add(new CuentaBanco("Luis Fernández", 4186.72f));
        listaCuentas.add(new CuentaBanco("Sofía Martínez", 3218.14f));
        listaCuentas.add(new CuentaBanco("José Sánchez", 1362.55f));
        listaCuentas.add(new CuentaBanco("Laura Díaz", 4673.94f));
        listaCuentas.add(new CuentaBanco("Antonio García", 1599.12f));
        listaCuentas.add(new CuentaBanco("Isabel Ruiz", 2671.34f));
        listaCuentas.add(new CuentaBanco("Pedro Morales", 1948.67f));
        listaCuentas.add(new CuentaBanco("Elena Torres", 4099.56f));
        listaCuentas.add(new CuentaBanco("David Herrera", 3382.27f));
        listaCuentas.add(new CuentaBanco("Lucía Ramírez", 4411.88f));
        listaCuentas.add(new CuentaBanco("Juanita Pérez", 3095.33f));
        listaCuentas.add(new CuentaBanco("Diego Jiménez", 2764.57f));
        listaCuentas.add(new CuentaBanco("Sara López", 3530.69f));
        listaCuentas.add(new CuentaBanco("Raúl García", 2478.15f));
        listaCuentas.add(new CuentaBanco("Marta Fernández", 2950.77f));
        listaCuentas.add(new CuentaBanco("Víctor García", 1853.49f));
        listaCuentas.add(new CuentaBanco("José Luis Sánchez", 4107.92f));
        listaCuentas.add(new CuentaBanco("Patricia Martín", 1734.65f));
        listaCuentas.add(new CuentaBanco("Fernando Ruiz", 4902.38f));
        listaCuentas.add(new CuentaBanco("Carmen Rodríguez", 3249.98f));
        listaCuentas.add(new CuentaBanco("Javier Díaz", 2701.50f));
        listaCuentas.add(new CuentaBanco("Ángela López", 3039.82f));
        listaCuentas.add(new CuentaBanco("Ricardo Gómez", 4155.21f));
        listaCuentas.add(new CuentaBanco("Beatriz Romero", 1822.98f));
        listaCuentas.add(new CuentaBanco("Alejandro Vázquez", 2829.75f));
        listaCuentas.add(new CuentaBanco("Claudia Ortega", 2689.62f));
    }
    
}
