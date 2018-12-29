package pl.rozanski.remigiusz.food;

import org.jetbrains.annotations.Contract;

public class Food {

    public FoodType foodType;

    public Food(FoodType foodType) {
        this.foodType = foodType;
    }

    public enum FoodType {
        CottageCheese("Cottage Cheese"),
        Chesse("Chesse"),
        Milk("Milk"),
        Bread("Bread"),
        Fish("Fish"),
        Water("Water"),
        Ham("Ham"),
        Bacon("Bacon"),
        Sausage("Sausage"),
        Potato("Potato"),
        Chocolate("Chocolate");

        private final String food;

        FoodType(String food) {
            this.food = food;
        }

        @Contract(pure = true)
        @Override
        public String toString() {
            return food;
        }
    }

    @Override
    public String toString() {
        return "foodType=" + foodType + '}';
    }
}
