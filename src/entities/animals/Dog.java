package entities.animals;

import entities.animals.Animal;
import entities.food.AnimalFood;
import entities.food.DogFood;

public class Dog extends Animal {
    private String breed;
    private boolean scared;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isScared() {
        return scared;
    }

    public void setScared(boolean scared) {
        this.scared = scared;
    }

    @Override
    public void eat(AnimalFood animalFood) {

    }
}
