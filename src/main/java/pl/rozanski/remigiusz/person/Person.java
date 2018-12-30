package pl.rozanski.remigiusz.person;

import pl.rozanski.remigiusz.animals.Animal;
import pl.rozanski.remigiusz.food.Food;
import pl.rozanski.remigiusz.foodContainers.Fridge;

import java.util.ArrayList;
import java.util.List;


public class Person {

    private String name;
    private List<Animal> animalList = new ArrayList<Animal>();
    private List<Food.FoodType> foodList = new ArrayList<Food.FoodType>();
    private Fridge hunger;


    public Person(String name) {
        this.name = name;
    }

    public void feed(){
        System.out.println(hunger);
    }

    public void addAnimals(Animal animal) {
        animalList.add(animal);
    }

    public void addFoodToFridge(Fridge fridge) {
        this.hunger = fridge;
    }

    @Override
    public String toString() {
        return "Hi, my name is: " + name + "\n" + " I have an animals: " + animalList + "\n" + " in my fridge i have: " + hunger + "\n";
    }
}
