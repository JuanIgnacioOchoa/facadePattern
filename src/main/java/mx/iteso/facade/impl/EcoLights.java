package mx.iteso.facade.impl;

import mx.iteso.facade.Lights;

public class EcoLights  implements Lights {
    private  boolean isOn;
    public void on() {
        isOn = true;
        System.out.println("EcoLights are ON");
    }

    public void off() {
        System.out.println("EcoLights are OFF");
        isOn = false;
    }
    public boolean isOn(){
        return isOn;
    }
}
