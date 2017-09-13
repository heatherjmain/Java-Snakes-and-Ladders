package com.example.heather;

import com.example.heather.javasnkaesandladders.Dice;
import com.example.heather.javasnkaesandladders.Player;
import com.example.heather.javasnkaesandladders.Rollable;

import org.junit.*;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by heather on 13/09/2017.
 */

public class PlayerTest {

    Player player;
    Rollable diceMock;


    @Before
    public void before(){
        diceMock = mock(Dice.class);
        player = new Player( "Heather", diceMock );
    }

    @Test
    public void testPlayerName() {
        assertEquals( "Heather", player.getName());
    }

    @Test
    public void testPlayerPoints(){
        assertEquals( 0 , player.getPosition());
    }

    @Test
    public void testCanTakeTurn() {
        when(diceMock.roll()).thenReturn(6);

        int result = player.takeTurn();

        assertEquals( 6, result );
    }
}
