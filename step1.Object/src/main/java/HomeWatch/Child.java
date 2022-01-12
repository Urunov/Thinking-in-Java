package HomeWatch;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Child implements PlayerTv {
   //
    private String name;
    private int age;

    private Narrator narrator;

    public Child(String name ) {
        //
        this.name = name;
        this.age = age;
        this.narrator = new Narrator(this, TalkingAtUs.Middle);
    }

    @Override
    public String getName() {
        return null;
    }

    public boolean canYouTurnOnTv(){
        //
        narrator.say("Can you turn on Tv?");

        if (canITurnOnTv()){
            narrator.say("yes, possible to");
            return true;
        } else{
            narrator.say("No,I'm still young and I can't turn it on. ");
            return false;
        }
    }

    public void turnOnTv(Tv tv){
        //
        narrator.say("yes, turn on");
        tv.turnOn();
    }

    public void turnVolumeUp(Tv tv){
        //
        narrator.say("yes, value is slow");
        tv.turnVolumeUp();
    }

    private boolean canITurnOnTv(){
        //
        if (age > 4){
            narrator.say(" possible to turn on Radio. ");
            return true;
        }
        narrator.say("I am so child for turn on tv");
        return false;
    }

}
