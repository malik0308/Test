package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malikfeddi on 10/05/16.
 */
public class Basket {

    private List<Fruit> fruitList = new ArrayList<>();

    public enum Fruit{
        BANANAS(1), APPLES(2), ORANGES(3),PEACHES(4),LEMONS(5);

        private int price;

        private Fruit(final int price){
            this.price = price;
        }

    };

    public void addMultipleFruit(final List fruits){
        fruitList.addAll(fruits);
    }

    public void addFruit(final Fruit fruit){
        fruitList.add(fruit);
    }

    public int calculateBasket(){
        return fruitList.stream().mapToInt(f -> f.price).sum();
    }
}
