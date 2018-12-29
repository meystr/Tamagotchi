package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Bird extends Animal {
    private String name;
    private List<Food> birdFoodList = new ArrayList<Food>();

    public Bird(String name) {
        this.name = name;
    }

    public void setBirdFoodList(List<Food> birdFoodList) {
        this.birdFoodList = birdFoodList;
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
        return "Bird: " + name;
    }
}
