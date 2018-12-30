package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Bird extends Animal {
    private String name;
    private List<Food.FoodType> birdFoodList = new ArrayList<Food.FoodType>();

    public Bird(String name) {
        this.name = name;
    }

    public void setBirdFoodList() {
        birdFoodList.add(Food.FoodType.Chesse);
        birdFoodList.add(Food.FoodType.Bread);
        birdFoodList.add(Food.FoodType.CottageCheese);
    }

    public String giveVoice() {
        return null;
    }

    public String introduceYourself() {
        return null;
    }

    public String doTrick() {
        return null;
    }

    @Override
    public String toString() {
        return "Bird: " + name + ", " + "I can eat:" + birdFoodList;
    }
}
