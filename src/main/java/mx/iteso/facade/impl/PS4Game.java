package mx.iteso.facade.impl;

import mx.iteso.facade.VideoGame;

public class PS4Game  implements VideoGame {
    String name;
    public boolean isOnline = false;
    public boolean isPlaying = false;
    public PS4Game(String name){
        this.name = name;
    }

    public void setOnlineMode() {
        isOnline = true;
        System.out.println("Setting Online mode on " + name);
    }

    public String play() {
        isPlaying = true;
        System.out.println("Playing " + name);
        return "Playing " + name;
    }
    public boolean isOnline(){
        return isOnline;
    }
    public boolean isPlaying()
    {
        return isPlaying;
    }
    public String getName() {
        return this.name;
    }
}
