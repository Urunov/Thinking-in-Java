package HomeFacilty;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Tv implements PlayerTv {
    //
    private String name;
    private boolean powerOn;
    private int volumeLevel;

    private Narrator narrator;

    public Tv(String name) {
        //
        this.name = name;
        this.powerOn = false;
        this.volumeLevel = 1;

        this.narrator = new Narrator(this, TalkingAtUs.Right);
    }


    @Override
    public String getName() {
        return null;
    }

    public boolean isPowerOn(){
        return this.powerOn;
    }

    public void turnOn(){
        //
        this.powerOn = true;
        this.volumeLevel = 1;
        this.broadcasting();
    }

    public void turnOff(){
        //
        this.powerOn = false;
        this.volumeLevel = 1;
    }

    public void turnVolumeUp(){
        //
        narrator.say("Value is up");
        volumeLevel++;
        broadcasting();
    }

    public void turnVolumeLevel(){
        //
        narrator.say("value is down");
        volumeLevel--;
        broadcasting();
    }

    public int getVolumeLevel(){
        //
        return volumeLevel;
    }

    private void broadcasting(){
        //
        narrator.say("[Name: " + volumeLevel + "] Ah, ah, let me tell you today's news.");
    }

}
