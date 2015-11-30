package mx.iteso.impl;

import mx.iteso.facade.GameConsole;
import mx.iteso.facade.VideoGame;
import mx.iteso.facade.impl.PS4Game;
import mx.iteso.facade.impl.XBOX;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestXBOX {
    @Test
    public void testXbox()
    {
        XBOX box = new XBOX();
        box.on();
        assertEquals(box.isOn, true);
        assertEquals(box.insertGame(new PS4Game("b")), "b");
        box.off();
        assertEquals(box.isOn, false);
    }
}
