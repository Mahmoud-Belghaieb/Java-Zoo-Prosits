import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "myZoo";

    public static void main(String[] args) {
        //Instruction 1
        ZooManagement zm = new ZooManagement();
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
    }
}
