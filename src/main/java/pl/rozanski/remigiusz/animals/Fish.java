package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Fish extends Animal {
    private String name;
    private List<Food.FoodType> fishFoodList = new ArrayList<Food.FoodType>();

    public Fish(String name) {
        this.name = name;
    }

    public void setFishFoodList() {
        fishFoodList.add(Food.FoodType.Bread);
    }

    public String giveVoice() {
        return null;
    }

    public String introduceYourself() {
        return name;
    }

    public String doTrick() {
        return null;
    }

    @Override
    public String toString() {
        return "Fish: " + name + ", " + "I can eat:" + fishFoodList;
    }
}
