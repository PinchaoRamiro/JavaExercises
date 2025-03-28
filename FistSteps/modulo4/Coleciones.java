package modulo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Coleciones {
  private List<String> namesList = new ArrayList<>();
  private Set<String> namesSet = new TreeSet<>();
  private Map<String,Float> productsMap = new HashMap<>();

  public void fillCollection(){
    namesList.add("Rosa");
    namesList.add("Natalia");
    namesList.add("Veronica");
    namesList.add("Daniela");
    namesList.add("Julieta");
    namesList.add("Nelly");
    namesList.add("Adriana");
    namesList.add("Ramiro");
    namesList.add("Rosa");  // Duplicate
    namesList.add("Daniela"); // Duplicate
    namesList.add("Ramiro");  // Duplicate

    // Adding elements from List to Set (duplicates will be removed)
    for(String name : namesList){
      namesSet.add(name);
    }
  }

  public void printNamesList(){
    System.out.println("Lista (with duplicates): " + namesList);
  }

  public void printNamesSet(){
    System.out.println("Set (duplicates removed, sorted): " + namesSet);
  }

  public void fillMap(){
    productsMap.put("Telefono", 54000f);
    productsMap.put("almohada", 30000f);
    productsMap.put("Arros", 12000f);
    productsMap.put("Solitude", 100000000000f);
  }

  public void printMap(){
    System.out.println("Map of Products: " + productsMap);
  }

  
}
