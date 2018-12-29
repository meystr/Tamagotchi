package pl.rozanski.remigiusz.animals;

import pl.rozanski.remigiusz.foodContainers.Fridge;

public abstract class Animal {
    private String name;
    private Fridge fridge;

    abstract public String giveVoice();

    abstract public String introduceYourself();
    abstract public String doTrick();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", fridge=" + fridge +
                '}';
    }
}
