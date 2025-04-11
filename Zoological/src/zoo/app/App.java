package zoo.app;

import zoo.management.AnimalRegistry;
import zoo.model.Mammal;
import zoo.model.Reptile;
import zoo.personal.BossZone;
import zoo.personal.Zookeeper;

public class App {

    private static void show(String[] animals){
        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        BossZone jefe = new BossZone("Laura", "BossZone", 3500.0f);
        AnimalRegistry register = jefe.registry;

        Mammal leon = new Mammal(1, "Simba", "Lion", "Savanna", true, "Meat");
        Mammal elefante = new Mammal(2, "Dumbo", "Elephant", "Jungle", false, "Leaves");

        register.AddAnimal(leon);
        register.AddAnimal(elefante);

        Reptile cobra =  new Reptile(1, "Nagini", "Cobra Real", "Zona Tropical", true);
        Reptile camaleon = new Reptile(2, "Rango", "Camaleón", "Zona Selvática", false);

        register.AddAnimal(camaleon);
        register.AddAnimal(cobra);


        Zookeeper cuidador = new Zookeeper("Carlos", "Zookeeper", 1800.0f);
        cuidador.animalCare.setRegistry(register);
        cuidador.animalCare.FeedMammals();
        System.out.println(" Fed animals");

        System.out.println("\n*List of Animals:");
        String[] animals = register.showAnimals();
        show(animals);

        System.out.println("\n\nReptiles");
        animals = register.getReptiles();
        show(animals);

        System.out.println("\n\nMammals");
        animals = register.getMammals();
        show(animals);

    }
}
