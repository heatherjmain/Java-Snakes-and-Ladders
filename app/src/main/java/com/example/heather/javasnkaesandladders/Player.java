package com.example.heather.javasnkaesandladders;

/**
 * Created by heather on 13/09/2017.
 */

public class Player implements Playing {

    String name;
    int position;
    Rollable dice;

    public Player( String name, Rollable dice ) {
        this.name = name;
        this.position = 0;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int takeTurn() {
        this.position += dice.roll();
        return position;
    }
}
