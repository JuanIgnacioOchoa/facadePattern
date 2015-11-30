package mx.iteso.impl;

import mx.iteso.facade.GameConsole;
import mx.iteso.facade.VideoGame;
import mx.iteso.facade.impl.PS4;
import mx.iteso.facade.impl.PS4Game;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPS4   {
    @Test
    public void testPS4()
    {
        PS4Game game = new PS4Game("aaaaaa");
        PS4 ps4 = new PS4();
        ps4.insertGame(game);
        ps4.on();
        assertEquals(ps4.isOn, true);
        game.play();
        game.setOnlineMode();
        assertEquals(game.getName(), "aaaaaa");
        assertEquals(game.isOnline, true);
        assertEquals(game.isPlaying(), true);
        ps4.off();
        assertEquals(ps4.isOn, false);
    }
}
