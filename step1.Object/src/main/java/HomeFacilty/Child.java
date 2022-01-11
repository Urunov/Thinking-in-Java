package HomeFacilty;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Child implements PlayerTv {
    //
    private String name;
    private int age;

    private Narrator narrator;

    public Child(String name, int age) {
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
        narrator.say("Can you turn on TV");
        if (canITurnOnTV()){
            narrator.say("yes, possible do it.");
            return true;
        } else{
            narrator.say("no, impossible to turn.");
            return false;
        }
    }

    public void turnOnTv(Tv tv){
        //
        narrator.say("yes, we can...");
        tv.turnOn();
    }

    public void turnVolumeUp(Tv tv){
        //
        narrator.say("yes, I'll turn up the volume.");
        tv.turnVolumeUp();
    }

    private boolean canITurnOnTV(){
        //
        if(age > 4){
            narrator.say("I'm five years old, so I'll have to turn on the tv...");
            return true;
        }
        narrator.say("I'm still too young to touch the tv. ");
        return false;
    }


}
