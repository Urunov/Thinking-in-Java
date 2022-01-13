package HomeFacilty;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Mama implements PlayerTv {

    private String name;
    private Child adorableChild;

    private Narrator narrator;

    public Mama(String name) {
        //
        this.name = name;
        this.adorableChild = new Child("Aleks", 5);
        this.narrator = new Narrator(this, TalkingAtUs.Left);
    }

    @Override
    public String getName() {
        return name;
    }

    public void listenToTv(Tv tv){
        //
        narrator.say("That's right, I'll watch to the tv.");

        narrator.say(adorableChild.getName() + "Can you turn on the tv?");

        if(adorableChild.canYouTurnOnTv()){
            narrator.say("Okay, so can you turn on the tv?");
            adorableChild.turnOnTv(tv);
            return;
        }
    }

    public void adjustTvVolume(Tv tv){
        //
        narrator.say("I'll adjust the sound.");


        if (!tv.isPowerOn()){
            narrator.say("This tv is off. I have to turn it on first and then adjust the sound.");
            return;
        }
        while (feelAsLowVolume(tv)){
            narrator.sayAndSleep("Little ....Let's listen for a moment. ", 4);
            narrator.say(adorableChild.getName() + ", Can you turn the noise down?");
            adorableChild.turnVolumeUp(tv);
        }
    }

    private boolean feelAsLowVolume(Tv tv){
        //
        if (tv.getVolumeLevel() < 4){
            narrator.say("... (listen)... ");
            narrator.say(" It sounds like it's small... ");
            return true;
        } else{
            narrator.say(" The sound is decent. ..");
            return false;
        }
    }
}
