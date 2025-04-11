package zoo.personal;

abstract public class Employee {
  private final String name;
  private final  String role;
  private final  float salary;

  public Employee ( String name, String role, float salary){
    this.name = name;
    this.role = role;
    this.salary = salary;
  }
  
  public String getName(){
    return name;
  }
  public String getRole(){
    return role;
  }
  public float getSalary(){
    return salary;
  }
}
