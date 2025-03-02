import Banco.Banco;
import Banco.Menu;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.llenarDatos(); // this is only by cases of depure

        Menu menu = new Menu(banco);
        menu.mostrarMenu();
    }
}
