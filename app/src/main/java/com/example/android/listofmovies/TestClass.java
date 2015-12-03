package com.example.android.listofmovies;

import java.util.ArrayList;

/**
 * Created by qichen on 12/3/15.
 */
public class TestClass {
    public class Fruit {
    }

    public class Apple extends Fruit {
    }

    public class Banana extends Fruit {
    }

    public class YellowBanana extends Banana {
    }

    public void main() {
        ArrayList<? extends Fruit> listOfFruit = new ArrayList<>();
        //listOfFruit.add(new Apple());
        ArrayList<? super Fruit> anotherListOfFruit = new ArrayList<>();
        anotherListOfFruit.add(new Apple());
        anotherListOfFruit.add(new Banana());
        anotherListOfFruit.add(new YellowBanana());
    }
}
