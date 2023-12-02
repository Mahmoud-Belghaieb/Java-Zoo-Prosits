package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;

import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    //Prosit1:
    /*int nbrCages = 20;
    String zooName = "myZoo";*/

    public static void main(String[] args) {
        //Prosit1:
        /*tn.esprit.gestionzoo.main.ZooManagement zm = new tn.esprit.gestionzoo.main.ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages.");

        tn.esprit.gestionzoo.main.ZooManagement zm1 = new tn.esprit.gestionzoo.main.ZooManagement();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nom du tn.esprit.gestionzoo.entities.Zoo:");
        String NouvzooName = sc.nextLine();
        zm1.zooName = NouvzooName;

        System.out.println("Nombre des cages:");
        int NouvnbrCages = sc.nextInt();
        zm1.nbrCages = NouvnbrCages;


        System.out.println(zm1.zooName + " tn.esprit.gestionzoo.entities.Zoo comporte " + zm1.nbrCages + " cages.");
    }*/

        //Prosit 2:
        Animal Lion = new Animal("Cats", "saba3", 15, true);

        Zoo myZoo = new Zoo("jurassic park", "7affouz");
        myZoo.setAnimals(new Animal[25]);
        Animal cat = new Animal("Tabby cat", "Puss in Boots", 2, true);

        //INSTRUCTION8:
        //myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        /*------------------------------------------------------------------------------*/

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(Lion));
        System.out.println(myZoo.addAnimal(cat));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(Lion));
        Animal Elgatto = new Animal("Mel chara3", "senior gatto", 51, true);
        System.out.println(myZoo.searchAnimal(Elgatto));

        System.out.println(myZoo.removeAnimal(cat));


        myZoo.displayAnimals();

    }
}
