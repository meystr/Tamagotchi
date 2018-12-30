package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {

    private String name;
    private List<Food.FoodType> dogFoodList = new ArrayList<Food.FoodType>();

    public void setDogFoodList() {
        dogFoodList.add(Food.FoodType.Sausage);
        dogFoodList.add(Food.FoodType.Water);
        dogFoodList.add(Food.FoodType.Bread);
        dogFoodList.add(Food.FoodType.Ham);
        dogFoodList.add(Food.FoodType.Fish);
        dogFoodList.add(Food.FoodType.Bacon);
    }

    public String giveVoice() {
        return "Whoa! whoa!";
    }

    public String introduceYourself() {
        return name;
    }

    public String doTrick() {
        return "Dog trick";
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog: " + name + ", " + "I can eat:" + dogFoodList;
    }

}
