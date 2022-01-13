package HomeWatch;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Child1 implements PlayerTv {
   //
    private String name;
    private int age;

    private Narrator narrator;

    public Child1(String name, int age ) {
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
        narrator.say("Can you turn on Tv?");

        if (canITurnOnTv()){
            narrator.say("yes, possible to");
            return true;
        } else{
            narrator.say("No, I'm still young and I can't turn it on. ");
            return false;
        }
    }

    public void turnOnTv(TvWatch tv){
        //
        narrator.say("yes, turn on");
        tv.turnOn();
    }

    public void turnVolumeUp(TvWatch tv){
        //
        narrator.say("yes, value is slow");
        tv.turnVolumeUp();
    }

    private boolean canITurnOnTv(){
        //
        if (age > 4){
            narrator.say(" possible to turn on TV. ");
            return true;
        }
        narrator.say("I am so child for turn on TV");
        return false;
    }

}
