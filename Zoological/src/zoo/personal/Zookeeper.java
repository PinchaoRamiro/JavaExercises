package zoo.personal;

import zoo.management.AnimalCare;

public class Zookeeper extends Employee {

  public AnimalCare animalCare = new AnimalCare();

  public Zookeeper( String name, String role, float salary){
    super( name, role, salary);
  }
}
