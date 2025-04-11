package zoo.model;

public class Reptile extends Animal {
  private final Boolean isPoisonous;

  public Reptile(int id, String name, String specie, String zoneAsigned, Boolean isPoisonous){
    super(id, name, specie, zoneAsigned);
    this.isPoisonous = isPoisonous;
  }

  public Boolean getIsPoisonous() {
    return isPoisonous;
  }

}
