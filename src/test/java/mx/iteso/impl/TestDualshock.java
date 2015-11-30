package mx.iteso.impl;

import mx.iteso.facade.impl.DualShock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 29/11/2015.
 */
public class TestDualshock {
    @Test
    public void testDualShock()
    {
        DualShock controller = new DualShock();
        controller.on();
        assertEquals(controller.isOn(), true);
        controller.off();
        assertEquals(controller.isOn(), false);
    }
}
