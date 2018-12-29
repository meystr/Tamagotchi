package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.food.Food;

import java.util.List;

public class Cat extends Animal {
    private String name;
    private List<Food> catFoodList;

    public Cat(String name) {
        this.name = name;
    }

    public void setFoodList(List<Food> catFoodList) {
        this.catFoodList = catFoodList;
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
        return "My name is: " + name
                + "I have in the fridge:" + catFoodList;
    }
}
