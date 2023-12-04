package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Carnivore;
import tn.esprit.gestionzoo.interfaces.Food;

public abstract non-sealed class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(){

    }
    public Aquatic(String family,String name, int age,boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat= habitat;
    }

    //INSTRUCTION28:
    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    //INSTRUCTION31:
    @Override
    public boolean equals(Object O){
        if (O == this) return true;
        if (O == null) return false;
        if (O instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }


}
