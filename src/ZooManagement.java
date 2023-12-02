import java.util.Scanner;

public class ZooManagement {
    //Prosit1:
    /*int nbrCages = 20;
    String zooName = "myZoo";*/

    public static void main(String[] args) {
        //Prosit1:
        /*ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages.");

        ZooManagement zm1 = new ZooManagement();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nom du Zoo:");
        String NouvzooName = sc.nextLine();
        zm1.zooName = NouvzooName;

        System.out.println("Nombre des cages:");
        int NouvnbrCages = sc.nextInt();
        zm1.nbrCages = NouvnbrCages;


        System.out.println(zm1.zooName + " Zoo comporte " + zm1.nbrCages + " cages.");
    }*/

        //Prosit 2:
        Animal Lion = new Animal("Cats", "saba3", 15, true);

        Zoo myZoo = new Zoo("jurassic park", "7affouz", 25);
        myZoo.animals = new Animal[25];
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
