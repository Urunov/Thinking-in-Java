package HomeMenu.player;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Children implements PlayerTv {
    //
    private String name;
    private int age;

    private Narrator narrator;

    public Children(String name, int age) {
        //
        this.name = name;
        this.age = age;

        this.narrator = new Narrator(this, TalkingAtUs.Middle);
    }


    @Override
    public String getName() {
        return name;
    }

    public boolean canYouTurnOnTv(){
        //
        narrator.say("Can you turn on TV set.");

        if (canITurnOnTvSet()){
            narrator.say("yes, turn on...");
            return true;
        } else{
            narrator.say("No, I'm still young and I can't turn it on. ");
            return false;
        }
    }

    public boolean canYouAdjustVolume(){
        //
        narrator.say("Can you change sound volume...");

        if (canIAdjustVolume()){
            narrator.say("yes, possible to...");
            return true;
        } else{
            narrator.say("no, I can't do it because I'm still young. ");
            return false;
        }
    }

    public void turnOnTvSet(TvSet tvSet){
        //
        if (!canITurnOnTvSet()){
            narrator.say("I cannot tv set ");
        }

        if (tvSet.isPowerOn()){
            narrator.say("It's already on.");
            return;
        }

        narrator.say("yes, I'll turn it on");
        tvSet.turnOn();
    }

    private boolean canITurnOnTvSet() {
        //
        if (age > 4){
            return true;
        }
        return false;
    }

    private boolean canIAdjustVolume(){
        //
        if (age > 4){
            return true;
        }
        return false;
    }

    public void turnVolumeUp(TvSet tvSet) {
        //
        if (!canIAdjustVolume()){
            narrator.say("I can not volume up ");
            return;
        }
        narrator.say("Please up value  ");
        tvSet.turnVolumeUp();
    }
}
