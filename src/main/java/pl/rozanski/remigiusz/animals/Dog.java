package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {

    private String name;
    private List<Food> dogFoodList = new ArrayList<Food>();

    public void setDogFoodList(List<Food> dogFoodList) {
        this.dogFoodList = dogFoodList;
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
        return "Dog: " + name;
    }

}
