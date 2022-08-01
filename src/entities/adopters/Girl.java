package entities.adopters;

import entities.animals.Animal;
import entities.food.AnimalFood;

public class Girl extends Person implements Adopter{
    private boolean petLover = true;
    private Animal adoptedPet;

    @Override
    public void adopt(Animal animal) {
        System.out.println("The animal " + animal.getName() + " was adopted");
        adoptedPet = animal;
    }

    public void nameAnimal(String name){
        adoptedPet.setName(name);
    }

    public void feedAnimal(AnimalFood food){
        adoptedPet.eat(food);
    }

}
