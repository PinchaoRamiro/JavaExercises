package zoo.model;

public abstract class Animal{
  protected int id;
  private final String name;
  public String specie;
  String zoneAsigned;
  private Boolean isFed = false;

  public Animal(int id, String name, String specie, String zoneAsigned){
    this.id = id;
    this.specie = specie;
    this.name = name;
    this.zoneAsigned = zoneAsigned;
  }

  public String getName(){
    return name;
  }

  public String getSpecie(){
    return specie;
  }

  public String getZoneAsigned() {
    return zoneAsigned;
  }

  public int getId() {
    return id;
  }

  public void setZoneAsigned(String zoneAsigned) {
    this.zoneAsigned = zoneAsigned;
  }

  // private void setName(String name){
  //   this.name = name;
  // }

  public String[] showInfo(){
    return new String[] {specie, zoneAsigned};
  }

  protected Object[] InternalReport(){
    return new Object[] {id, name};
  }

  protected Boolean ValidateZone(String zone){
    return zoneAsigned.equals(zone);
  }

  
  public Boolean getIsFed() {
    return isFed;
  }

  private void setIsFed(Boolean isFed) {
    this.isFed = isFed;
  }

  public String Feed(){
    if(getIsFed()){
      return "The animal has already been fed";
    }else{
      setIsFed(true);
      return "the animal was fed";
    }
  }
  

}

