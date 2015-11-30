package mx.iteso.facade.impl;

import mx.iteso.facade.GameController;

public class DualShock  implements GameController {
    private boolean isOn;
    public void on() {
        isOn = true;
        System.out.println("DualShock wireless controller is ON");
    }

    public void off() {
        isOn = false;
        System.out.println("DualShock wireless controller is OFF");
    }
    public boolean isOn(){
        return isOn;
    }
}
