package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malikfeddi on 10/05/16.
 */
public class Basket {

    private List<Fruit> fruitList = new ArrayList<>();

    public enum Fruit{
        BANANAS(1.5), APPLES(2.5), ORANGES(3),PEACHES(4),LEMONS(5);

        private double price;

        private Fruit(final double price){
            this.price = price;
        }

    };

    public void addMultipleFruit(final List fruits){
        fruitList.addAll(fruits);
    }

    public void addFruit(final Fruit fruit){
        fruitList.add(fruit);
    }

    public double calculateBasket(){
        return fruitList.stream().mapToDouble(f -> f.price).sum();
    }
}
