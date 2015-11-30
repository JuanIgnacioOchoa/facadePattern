package mx.iteso.impl;

import mx.iteso.facade.Lights;
import mx.iteso.facade.impl.EcoLights;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEcoLights  {
    @Test
    public void testEcoLights()
    {
        EcoLights light = new EcoLights();
        light.on();
        assertEquals(light.isOn(), true);
        light.off();
        assertEquals(light.isOn(), false);
    }
}
