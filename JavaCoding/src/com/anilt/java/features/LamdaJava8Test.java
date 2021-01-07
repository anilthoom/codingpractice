package com.anilt.java.features;

import java.util.ArrayList;
import java.util.List;

public class LamdaJava8Test
{
    public static void main(String[] args)
    {
        runAnanymous();
        new Thread(
                () -> System.out.println("Runnnn........")
        ).start();

        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        System.out.println("------------Iterating by passing lambda expression--------------");
        gamesList.forEach(games -> System.out.println(games));
    }
    static void runAnanymous()
    {
        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Ananymous class");
            }

        }).start();
    }

}
