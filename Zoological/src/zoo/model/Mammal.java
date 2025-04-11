package zoo.model;

public class Mammal extends Animal {
  private final Boolean haveHair;
  private final String wayOfFeeding;

  public Mammal(int id, String name, String specie, String zoneAsigned, Boolean haveHair, String wayOfFeeding){
    super(id, name, specie, zoneAsigned);
    this.haveHair = haveHair;
    this.wayOfFeeding = wayOfFeeding;
  }

  public Boolean getHaveHair() {
      return haveHair;
  }

  public String getWayOfFeeding() {
    return wayOfFeeding;
  }  
  
}
