package mx.iteso.facade.impl;

import mx.iteso.facade.TV;

public class SonyBravia implements TV {
    public boolean isOn = false;
    public boolean HDMI = false;
    public void on() {
        isOn = true;
        System.out.println("Sony Bravia is ON");
    }

    public void off() {
        isOn = false;
        System.out.println("Sony Bravia is OFF");
    }

    public void toHDMI() {
        HDMI= true;
        System.out.println("Changing Sony Bravia input to HDMI");
    }
}
