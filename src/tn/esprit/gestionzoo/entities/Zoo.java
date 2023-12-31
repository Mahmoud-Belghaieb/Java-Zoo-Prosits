package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    static final int CAGES_NUMBER=25;

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getNbrAquatics() {
        return nbrAquatics;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquatics = nbrAquatics;
    }

    private int nbrAnimals;
    private Aquatic[] aquaticAnimals;
    private int nbrAquatics;

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank())
            System.out.println("Brother, you forgot to give a Name to the tn.esprit.gestionzoo.entities.Zoo");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Zoo(String name, String city) {
        animals = new Animal[CAGES_NUMBER];
        this.name = name;
        this.city = city;
    }

    void displayZoo() {
        System.out.println("Name: " + name + "|| City: " + city + "|| N° Cages/Animals: " + CAGES_NUMBER);
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (searchAnimal(animal) != -1)
            System.out.println("This animal already exist");
        if (isZooFull()){
            throw new ZooFullException("The Zoo is full");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean removeAnimal(Animal animal) {
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


    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    boolean isZooFull(){
        return nbrAnimals ==CAGES_NUMBER;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals < z2.nbrAnimals)
            return z2;
        return z1;
    }

    //INSTRUCTION26:
    public void addAquaticAnimal(Aquatic aquatic) {
        aquaticAnimals[nbrAquatics] = aquatic;
        nbrAquatics++;
    }

    //INSTRUCTION29:
    public float maxPenguinSwimmingDepth(){
        float maxDepth = 0f;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxDepth < penguin.getSwimmingDepth())
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }

    //INSTRUCTION30:
    public void displayNumberOfAquaticsByType(){
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Zoo " + name + " contains " + nbrDolphins + " Dolphins and " + nbrPenguins + " Penguins");
    }


    @Override
    //INSTRUCTION9:
    public String toString() {
        return "Name: " + name + "|| City: " + city + "|| N° Cages/Animals: " + CAGES_NUMBER;
    }
}
