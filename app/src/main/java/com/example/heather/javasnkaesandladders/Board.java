package com.example.heather.javasnkaesandladders;

import java.util.ArrayList;

/**
 * Created by heather on 13/09/2017.
 */

public class Board {
    private ArrayList<Playing> players;
//    private Playing currentPlayer = players.get(0);
    private int winningTile = 10;



    public Board() {
        this.players = new ArrayList<>();
        this.winningTile = 10;
    }

    public ArrayList<Playing> getPlayers() {
        return players;
    }

    public void addPlayer(Playing player) {
        this.players.add(player);
    }

//    public String currentPlayer() {
//        currentPlayer = players.
//    }

    public String isWinner() {
        for(Playing player: this.players) {
            if Player.position() == winningTile;
        }
        return Player.getName();


    }

//    public String nextTurn() {
//
//
//
//
//
//        return nextPlayer;
//    }
}
