package zoo.management;

import zoo.model.Mammal;

public class AnimalCare {
  private AnimalRegistry register;

  public void setRegistry(AnimalRegistry registry) {
    this.register = registry;
  }


  public void FeedMammals() {
    register.animals.stream()
        .filter(a -> a instanceof Mammal)
        .map(a -> (Mammal) a)
        .forEach(Mammal::Feed);
  }

}
