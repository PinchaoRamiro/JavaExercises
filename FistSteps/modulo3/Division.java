package modulo3;

public class Division {

  public static void calculate(int number1, int number2){
    try {
      int result = number1 / number2;
      System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println("Error arithmetic operation");;
    }

  }

}
