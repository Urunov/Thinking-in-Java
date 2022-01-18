package HomeMenu.player;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class TvSet implements PlayerTv {
    //
    private static final int MaxVolumeLevel = 10;
    private static final int MinVolumeLevel = 1;

    private String name;
    private boolean powerOn;
    private int volumeLevel;
    private Narrator narrator;

    public TvSet(String name) {
        //
        this.name = name;
        this.powerOn = false;
        this.volumeLevel = MinVolumeLevel;

        this.narrator = new Narrator(this, TalkingAtUs.Right);
    }

    public boolean isPowerOn() {
        //
        return this.powerOn;
    }

    public void turnOn() {
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
        if (volumeLevel < MaxVolumeLevel){
            narrator.say("Turn up the sound.");
            volumeLevel++;
            broadcasting();
        }
    }

    public void turnVolumeDown(){
        //
        if (volumeLevel > MinVolumeLevel){
            narrator.say("lower the sound");
            volumeLevel--;
            broadcasting();
        }
    }

    public int getVolumeLevel(){
        //
        return volumeLevel;
    }

    private void broadcasting() {
        //
        narrator.say("[Volume: " + volumeLevel + "]  Oh, let me tell you today's news.");
    }

    @Override
    public String getName() {
        return name;
    }
}
