package mx.iteso.impl;

import mx.iteso.facade.Router;
import mx.iteso.facade.impl.Linksys;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLinksys   {
    @Test
    public void testLinksys()
    {
        Linksys link = new Linksys();
        link.on();
        assertEquals(link.isOn(), true);
        link.off();
        assertEquals(link.isOn(), false);
        assertEquals(link.checkInternet(), "Internet connection is OK");
    }
}
