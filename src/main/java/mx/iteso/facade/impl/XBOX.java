package mx.iteso.facade.impl;

import mx.iteso.facade.GameConsole;
import mx.iteso.facade.VideoGame;

public class XBOX implements GameConsole {
    public boolean isOn = false;
    public void on() {
        isOn = true;
        System.out.println("XBOX One is ON");
    }

    public void off() {
        isOn = false;
        System.out.println("XBOX One is OFF");
    }

    public String insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into XBOX One");
        return videoGame.getName();
    }
}
