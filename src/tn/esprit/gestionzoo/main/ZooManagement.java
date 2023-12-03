package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {
    //Prosit1:
    /*int nbrCages = 20;
    String zooName = "myZoo";*/

    public static void main(String[] args) {

        Animal Lion = new Animal();
        Lion.setName("saba3");
        try{
            Lion.setAge(8);
        } catch (InvalidAgeException e) {
            System.out.println(
                    e.getMessage()
            );
        }
        Lion.setFamily("Cats");
        Lion.setMammal(true);

        Zoo myZoo = new Zoo("jurassic park", "7affouz");
        myZoo.setAnimals(new Animal[25]);
        Animal cat = new Animal("Tabby cat", "Puss in Boots", 2, true);

        try {
            myZoo.addAnimal(Lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }
        try {
            myZoo.addAnimal(cat);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        try {
            myZoo.addAnimal(Lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }
        try {
            myZoo.addAnimal(cat);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(Lion));
        Animal Elgatto = new Animal("Mel chara3", "senior gatto", 51, true);
        System.out.println(myZoo.searchAnimal(Elgatto));

        System.out.println(myZoo.removeAnimal(cat));

        myZoo.displayAnimals();

        Dolphin d = new Dolphin();
        d.setSwimmingSpeed(24.5f);
        myZoo.addAquaticAnimal(d);

        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(21.8f);
        myZoo.addAquaticAnimal(d1);

        Penguin p = new Penguin();
        p.setSwimmingDepth(24.6f);
        myZoo.addAquaticAnimal(p);

        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(29.6f);
        myZoo.addAquaticAnimal(p1);

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }
    }
}
