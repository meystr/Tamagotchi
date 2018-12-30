package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {
    private String name;
    private List<Food.FoodType> catFoodList = new ArrayList<Food.FoodType>();

    public Cat(String name) {
        this.name = name;
    }

    public void setFoodList() {
        this.catFoodList.add(Food.FoodType.Ham);
        this.catFoodList.add(Food.FoodType.Bacon);
        this.catFoodList.add(Food.FoodType.Milk);
        this.catFoodList.add(Food.FoodType.Water);
        this.catFoodList.add(Food.FoodType.Sausage);
    }

    @Override
    public String giveVoice() {
        return "Meow, meow";
    }

    @Override
    public String introduceYourself() {
        return name;
    }

    @Override
    public String doTrick() {
        return "Cat trick!";
    }

    @Override
    public String toString() {
        return "Cat: " + name + ", " + "I can eat:" + catFoodList;
    }
}
