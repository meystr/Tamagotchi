package pl.rozanski.remigiusz.person;

import pl.rozanski.remigiusz.animals.Animal;
import pl.rozanski.remigiusz.food.Food;
import pl.rozanski.remigiusz.foodContainers.Fridge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

    private String name;
    private List<Animal> animalList = new ArrayList<Animal>();
    private List<Food.FoodType> foodList = new ArrayList<Food.FoodType>();
    private Fridge hunger;

    public Person(String name) {
        this.name = name;
    }

    public void feed() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Feed time");
        do {
            System.out.println("Choice one item from your fridge: " + "( from 0 to " + (hunger.getFoodList().size() - 1) + ")");
            System.out.println("Press @ to break feed.");
            hunger.showFoodList();
            choice = scanner.nextInt();
            hunger.removeFood(choice);
            if (hunger.getFoodList().size() == 0){
                System.out.println("Your fridge is empty!!!");
                break;
            }
        } while (choice != '@' || hunger.getFoodList().size() != 0);
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
