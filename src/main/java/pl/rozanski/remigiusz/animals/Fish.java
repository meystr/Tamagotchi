package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Fish extends Animal {
    private String name;
    private List<Food> fishFoodList = new ArrayList<Food>();

    public Fish(String name) {
        this.name = name;
    }

    public void setFishFoodList(List<Food> fishFoodList) {
        this.fishFoodList = fishFoodList;
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
        return "Fish: " + name;
    }
}
