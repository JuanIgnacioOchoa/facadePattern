package mx.iteso.impl;

import mx.iteso.facade.TV;
import mx.iteso.facade.impl.SonyBravia;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSonyBravia {
    @Test
    public void testSonyBravia()
    {
        SonyBravia tv = new SonyBravia();
        tv.on();
        assertEquals(tv.isOn, true);
        tv.toHDMI();
        assertEquals(tv.HDMI, true);
        tv.off();
        assertEquals(tv.isOn, false);
    }
}
