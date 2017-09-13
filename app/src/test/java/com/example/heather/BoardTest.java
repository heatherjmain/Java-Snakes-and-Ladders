package com.example.heather;

import com.example.heather.javasnkaesandladders.Board;
import com.example.heather.javasnkaesandladders.Player;
import com.example.heather.javasnkaesandladders.Rollable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 13/09/2017.
 */
public class BoardTest {

    Board board;
    Player player1;
    Player player2;
    Rollable mockDice;

    @Before
    public void before(){
        board = new Board();
        player1 = new Player("Heather", mockDice);
        player2 = new Player("Iain", mockDice);
    }

    @Test
    public void canAddPLayerToArray(){
        board.addPlayer(player1);
        board.addPlayer(player2);
        assertEquals( 2, board.getPlayers().size());
    }

    @Test
    public void canInstructNextTurn() {

        assertEquals( "Iain", board.nextTurn() );

    }

    @Test
    public void CanHaveWinner() {
        assertEquals( "iain", board.isWinner());
    }
}