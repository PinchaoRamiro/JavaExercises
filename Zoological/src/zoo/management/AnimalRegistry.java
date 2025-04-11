package zoo.management;

import java.util.ArrayList;
import java.util.List;
import zoo.model.Animal;
import zoo.model.Mammal;
import zoo.model.Reptile;

public class AnimalRegistry {
  List<Animal> animals = new ArrayList<>();

  public String AddAnimal(Mammal mamal){
    int id = animals.size() +1;
    Animal animal = new Mammal(id, mamal.getName(), mamal.getSpecie(), mamal.getZoneAsigned(), mamal.getHaveHair(), mamal.getWayOfFeeding());
    animals.add(animal);
    return "mammal added";

  }

  public String AddAnimal(Reptile reptile){
    int id = animals.size() +1;
    Animal animal = new Reptile(id, reptile.getName(), reptile.getSpecie(), reptile.getZoneAsigned(), reptile.getIsPoisonous());
    animals.add(animal);
    return "Reptile added";
  }

  public String ChangeZone(int id, String newZone){
    Animal animal = animals.stream()
                    .filter(a -> a.getId() == id)
                    .findFirst()
                    .orElse(null);
    if(animal == null){
      return "Animal not found";
    }else{
      animal.setZoneAsigned(newZone);
      return "Ok";
    }
  }

  public String[] getMammals() {
    return animals.stream()
        .filter(a -> a instanceof Mammal)
        .map(a -> a.getName() + "-" + String.join(" - ", a.showInfo()) )
        .toArray(String[]::new);
  }

  public String[] getReptiles() {
    return animals.stream()
        .filter(a -> a instanceof Reptile)
        .map(a -> a.getName() + "-" + String.join(" - ", a.showInfo()) )
        .toArray(String[]::new);
  }

  public String[] showAnimals() {
    return animals.stream()
        .map(a -> a.getName() + " - " + a.getSpecie())
        .toArray(String[]::new);
  }

  public String[] GetBySpecie(String specie){
    return animals.stream()
      .filter(a -> a.getSpecie().equals(specie))
      .map(a -> a.getName() + "-" + String.join(" - ", a.showInfo()) )
      .toArray(String[]::new);
  }

  public int NumberOfAnimalsBySpecie(String specie){
    int cont = 0;
    for(Animal animal : animals){
      if(animal.getSpecie().equals(specie)){
        cont++;
      }
    }

    return cont;
  }

  public String[] getByZone(String zone){
    return animals.stream()
          .filter(a -> a.getZoneAsigned().equals(zone))
          .map(a -> a.getName() + "-" + String.join(" - ", a.showInfo()) )
          .toArray(String[]::new);
  }

}
