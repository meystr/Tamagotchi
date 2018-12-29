package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.food.Food;

import java.util.List;

public class Fish extends Animal {
    private String name = "Gold Fish";
    private List<Food> fishFoodList;

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
        return "My name is: " + name
                + "I have in the fridge:" + fishFoodList;
    }
}
