package mx.iteso.facade.impl;

import mx.iteso.facade.GameConsole;
import mx.iteso.facade.VideoGame;

public class PS4  implements GameConsole {
    public boolean isOn = false;
    public void on()
    {
        isOn = true;
        System.out.println("Play Station 4 is ON");
    }

    public void off()
    {
        isOn = false;
        System.out.println("Play Station 4 is OFF");
    }

    public String insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into Play Station 4");
        return videoGame.getName() + " has been inserted into Play Station 4";
    }
}
