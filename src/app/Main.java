package app;

import entities.AnimalShelter;
import entities.animals.Cat;
import entities.animals.Dog;
import entities.adopters.Father;
import entities.adopters.Girl;
import entities.animals.Duck;
import entities.food.DogFood;
import entities.states.HappinessStates;

public class Main {

    public static void main(String[] args) {
        Father father = new Father();

        Girl girl = new Girl();
        girl.setName("Ioana");
        girl.setAge(7);
        girl.setHairColor("Red");
        girl.setHeight(4);


        Dog dog = new Dog();
        dog.setBreed("Corcitura de labrador");
        dog.setAge(1);
        dog.setWeight(1);
        dog.setHappinesLevel(HappinessStates.SAD);
        dog.setHungry(false);
        dog.setScared(true);

        Cat cat = new Cat();
        cat.setName("Felina");
        cat.setAge(2);

        Duck duck = new Duck();

        AnimalShelter shelter = new AnimalShelter();
        shelter.addAnimal(dog);
        shelter.addAnimal(cat);
        shelter.addAnimal(duck);

        girl.adopt(dog);
        shelter.removeAnimal(dog);

        girl.nameAnimal("Grivey");

        DogFood dogFood = new DogFood();
        girl.feedAnimal(dogFood);
        dog.setHappinesLevel(HappinessStates.NEUTRAL);

    }
}
