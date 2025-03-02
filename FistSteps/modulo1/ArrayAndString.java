package modulo1;
import java.util.Arrays;

public class ArrayAndString {
  int num[] = {3, 2, 5, 6, 2 , 8, 9, 10, 12, 15};
  String str = "Hello World";
  public static int sum(int[] num){
    int sum = 0;
    for(int x : num){
      sum += x;
    }
    return sum;
  }

  public static int max(int[] num){
    Arrays.sort(num);
    return num[num.length - 1];
  }

  public static String reverse(String str){
    String reverse = "";
    for(int i = str.length() - 1; i >= 0; i--){
      reverse += str.charAt(i);
    }
    return reverse;
  }

  public static String HowManyExist(String str, char c){
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == c){
        count++;
      }
    }
    return "The character " + c + " appears " + count + " times";
  }

}
