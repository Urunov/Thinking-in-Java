package Home;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Tvs implements PlayerTv {
    //
    private String name;
    private boolean powerOn;
    private int valueLevel;

    private Narrator narrator;

    public Tvs(String name) {
        //
        this.name = name;
        this.powerOn = false;
        this.valueLevel = 1;

        this.narrator = new Narrator(this, TalkingAtUs.Right);
    }

    public boolean isPowerOn(){
        return this.powerOn;
    }

    public void turnOn(){
        //
        this.powerOn = true;
        this.valueLevel =1;
        this.broadcasting();
    }

    public void turnOff(){
        //
        this.powerOn = false;
        this.valueLevel = 1;
    }

    private void broadcasting(){
        //
        narrator.say("Value: " + valueLevel + " good new in TV today");
    }
    @Override
    public String getName() {
        return name;
    }
}
