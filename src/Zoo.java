public class Zoo {
    Animal [] animals;
    String name;
    String city;
    static final int CAGES_NUMBER=25;
    int nbrAnimals;

    public Zoo(String name, String city) {
        animals = new Animal[CAGES_NUMBER];
        this.name = name;
        this.city = city;
    }

    void displayZoo() {
        System.out.println("Name: " + name + "|| City: " + city + "|| N° Cages/Animals: " + CAGES_NUMBER);
    }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimals == CAGES_NUMBER)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }


    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    boolean isZooFull(){
        return nbrAnimals ==CAGES_NUMBER;
    }

    Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals < z2.nbrAnimals)
            return z2;
        return z1;
    }


    @Override
    //INSTRUCTION9:
    public String toString() {
        return "Name: " + name + "|| City: " + city + "|| N° Cages/Animals: " + CAGES_NUMBER;
    }
}
