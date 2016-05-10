package test.java;


import main.java.Basket;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static main.java.Basket.Fruit.*;

/**
 * Created by malikfeddi on 10/05/16.
 */
public class BasketTest {

    @Test
    public void calulateBasquet(){
        final Basket basket = new Basket();
        List fruits = asList(BANANAS,APPLES);
        basket.addMultipleFruit(fruits);
        Assert.assertEquals(3, basket.calculateBasket());
        basket.addFruit(ORANGES);
        Assert.assertEquals(3+3, basket.calculateBasket());
        basket.addMultipleFruit(asList(PEACHES,LEMONS));
        Assert.assertEquals(3+3+4+5, basket.calculateBasket());
    }
}


