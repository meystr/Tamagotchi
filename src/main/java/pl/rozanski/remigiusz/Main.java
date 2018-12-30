package pl.rozanski.remigiusz;

import pl.rozanski.remigiusz.animals.Bird;
import pl.rozanski.remigiusz.animals.Cat;
import pl.rozanski.remigiusz.animals.Dog;
import pl.rozanski.remigiusz.animals.Fish;
import pl.rozanski.remigiusz.food.Food;
import pl.rozanski.remigiusz.foodContainers.Fridge;
import pl.rozanski.remigiusz.person.Person;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Tiger");
        Cat cat = new Cat("Max");
        Fish fish = new Fish("Gold Fish");
        Bird bird = new Bird("Alex");

        Person person = new Person("Remek");
        Fridge fridge = new Fridge();

        fridge.addFood(Food.FoodType.Bacon);
        fridge.addFood(Food.FoodType.Bread);
        fridge.addFood(Food.FoodType.Chesse);
        fridge.addFood(Food.FoodType.Chocolate);
        fridge.addFood(Food.FoodType.CottageCheese);
        fridge.addFood(Food.FoodType.Fish);
        fridge.addFood(Food.FoodType.Ham);
        fridge.addFood(Food.FoodType.Milk);
        fridge.addFood(Food.FoodType.Potato);
        fridge.addFood(Food.FoodType.Sausage);
        fridge.addFood(Food.FoodType.Water);

        person.addAnimals(dog);
        person.addAnimals(cat);
        person.addAnimals(fish);
        person.addAnimals(bird);


        person.addFoodToFridge(fridge);
        System.out.println(person);
        cat.setFoodList();
        System.out.println(cat);
        dog.setDogFoodList();
        System.out.println(dog);
        fish.setFishFoodList();
        System.out.println(fish);
        bird.setBirdFoodList();
        System.out.println(bird);


        person.feed();
    }
}
