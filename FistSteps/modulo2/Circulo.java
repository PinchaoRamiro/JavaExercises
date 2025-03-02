package modulo2;
public class Circulo implements Form {
  private int radio;
  public Circulo(int radio){
    this.radio = radio;
  }
  public void draw(){
    System.out.println("Drawing a circle");
  }
  
  public int calculateArea(){
    return (int) (Math.PI * radio * radio);
  }
  
}
