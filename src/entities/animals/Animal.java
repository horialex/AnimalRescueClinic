package entities.animals;

import entities.food.AnimalFood;
import entities.states.HappinessStates;

public abstract class Animal {
    private String name;
    private int age;
    private int weight;
    private HappinessStates happinesLevel;
    private boolean isHungry;

    public abstract void eat(AnimalFood animalFood);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HappinessStates getHappinesLevel() {
        return happinesLevel;
    }

    public void setHappinesLevel(HappinessStates happinesLevel) {
        this.happinesLevel = happinesLevel;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
