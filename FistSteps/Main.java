import modulo1.ArrayAndString;
// import java.util.Scanner;
import modulo2.Book;
import modulo2.Cat;
import modulo2.Dog;
import modulo3.Division;
import modulo3.Comprar;

public class Main {
  public static void main(String[] args) {
    String a = System.getProperty("user.name");
    System.out.println("Hola " + a.toLowerCase());
    int[] num = {3, 2, 5, 6, 2 , 8, 9, 10, 12, 15};
    String str = "Hello World";
    System.out.println("The sum of the array is: " + ArrayAndString.sum(num));
    System.out.println("The max of the array is: " + ArrayAndString.max(num));
    System.out.println("The reverse of the string is: " + ArrayAndString.reverse(str));
    System.out.println(ArrayAndString.HowManyExist(str, 'o'));

    Book libro = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
    System.out.println(libro);

    Dog dog = new Dog();
    dog.makeSound();

    Cat cat = new Cat();
    cat.makeSound();

    Division.calculate(2, 0);

    Comprar TryF = new Comprar(10, 6);

    TryF.comprobar();

    TryF.comprobar();

  }
}
