package pl.rozanski.remigiusz.foodContainers;

import pl.rozanski.remigiusz.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Fridge {


    private List<Food.FoodType> foodList = new ArrayList<Food.FoodType>();

    public void addFood(Food.FoodType food){
        foodList.add(food);
    }
    public void removeFood(Food.FoodType food){
        foodList.remove(food);
    }

    @Override
    public String toString() {
        return String.valueOf(foodList);
    }
}
