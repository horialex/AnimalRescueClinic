package entities;

import entities.animals.Animal;

import java.util.List;

public class AnimalShelter {
    private List<Animal> availableAnimals;

    public void addAnimal(Animal animal){
        availableAnimals.add(animal);
    }

    public void removeAnimal(Animal animal){
        availableAnimals.remove(animal);
    }

}
