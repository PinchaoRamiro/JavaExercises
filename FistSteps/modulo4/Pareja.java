package modulo4;

public class Pareja<T, U> {
  private T objet1;
  private U objet2;

  public Pareja(T objet1, U objet2){
    this.objet2 = objet2;
    this.objet1 = objet1;
  }

  public T getObjet1(){
    return objet1;
  }

  public U getObjet2(){
    return objet2;
  }

  public void realizarOperacion() {
    Class<?> tipo = objet1.getClass();
    Class<?> tipo2 = objet2.getClass();

    if (tipo.equals(String.class) && tipo2.equals(String.class)) {

      System.out.println((String)objet1 + (String)objet2);

    } else if (tipo.equals(Integer.class) && tipo2.equals(Integer.class)) {

        System.out.println("El tipo es Integer: " + (Integer)((Integer)objet1  + (Integer)objet2));

    } else {
        System.out.println("Tipo desconocido: " + tipo.getName() + " " + tipo2.getName());
    }
  }

}
