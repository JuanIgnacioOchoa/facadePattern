package mx.iteso.facade.impl;

import mx.iteso.facade.SoundSystem;

public class Bose implements SoundSystem {
    private boolean On;

    public void on() {
        On = true;
        System.out.println("Bose Surround System is turning ON");
        System.out.println("Bose Surround System is ON");
    }

    public void off() {
        On = false;
        System.out.println("Bose Surround System is turning OFF");
        System.out.println("Bose Surround System is OFF");

    }
    public boolean isOn() {
        return On;
    }

    public String toOpticalEntry() {
        System.out.println("Changing Bose input to Optical");
        return "Changing Bose input to Optical";
    }
}
