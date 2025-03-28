import database.db;
import store.Store;
import ui.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        Store store = new Store();
        db db = new db();
        db.conect(store);
        MainWindow mainWindow = new MainWindow();
        mainWindow.initStore(store);
    }

}
