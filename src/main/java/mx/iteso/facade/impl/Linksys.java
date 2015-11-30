package mx.iteso.facade.impl;

import mx.iteso.facade.Router;

public class Linksys  implements Router {
    private boolean isOn;
    public void on() {
        isOn = true;
        System.out.println("Linksys router is ON");
    }

    public void off() {
        isOn = false;
        System.out.println("Linksys router is OFF");
    }
    public boolean isOn(){
        return isOn;
    }
    public String  checkInternet() {
        System.out.println("Checking internet connection");
        System.out.println("Internet connection is OK");
        return "Internet connection is OK";
    }
}
