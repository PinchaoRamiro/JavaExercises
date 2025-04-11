package zoo.personal;

import zoo.management.AnimalRegistry;

public class BossZone extends Employee {
  public AnimalRegistry registry = new AnimalRegistry();
  
  public BossZone( String name, String role, float salary){
    super(name, role, salary);
  }

}
