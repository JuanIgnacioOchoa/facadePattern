package mx.iteso.impl;

import mx.iteso.facade.impl.Bose;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 29/11/2015.
 */
public class TestBosse {
    Bose bose;
    @Test
    public void testBose()
    {
        bose = new Bose();
        bose.on();
        assertEquals(bose.isOn(), true);
        assertEquals(bose.toOpticalEntry(), "Changing Bose input to Optical");
        bose.off();
        assertEquals(bose.isOn(), false);
    }
}
