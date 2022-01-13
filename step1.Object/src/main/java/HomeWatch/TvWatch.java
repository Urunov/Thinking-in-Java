package HomeWatch;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class TvWatch implements PlayerTv {
    //
    private String name;
    private boolean powerOn;
    private int volumeLevel;

    private Narrator narrator;

    public TvWatch(String name) {
        //
        this.name = name;
        this.powerOn = false;
        this.volumeLevel = 1;

        this.narrator = new Narrator(this, TalkingAtUs.Right);
    }

    public boolean isPowerOn(){
        //
        return this.powerOn;
    }

    public void turnOn(){
        //
        this.powerOn = true;
        this.volumeLevel = 1;
        this.broadcasting();
    }
    @Override
    public String getName() {
        return name;
    }

    public void turnOff(){
        //
        this.powerOn = false;
        this.volumeLevel = 1;
    }

    public void turnVolumeUp(){
        //
        narrator.say("Value of sound is low");
        volumeLevel++;
        broadcasting();
    }

    public void turnVolumeDown(){
        //
        narrator.say("Sound will be down");
        volumeLevel--;
        broadcasting();
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }
    private void broadcasting(){
        //
        narrator.say("[Volume: "+ volumeLevel + "today is good news");
    }
}
