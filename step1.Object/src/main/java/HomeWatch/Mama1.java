package HomeWatch;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Mama1 implements PlayerTv {
    //
    private String name;
    private Child1 adorableChild;
    private LivingRoom livingRoom;

    private Narrator narrator;

    public Mama1(String name, LivingRoom livingRoom) {
       //
        this.name = name;
        this.adorableChild = new Child1("Alex", 5);
        this.livingRoom = livingRoom;
        this.narrator = new Narrator(this, TalkingAtUs.Left);
    }


    @Override
    public String getName() {
        return name;
    }

    public Child1 callSon(){
        //
        return adorableChild;
    }

    public void watchToTv(){
        //
        narrator.say("That's right, I'll listen to the radio.");

        TvWatch tvWatch = livingRoom.getTv();
        narrator.say(adorableChild.getName() + ", can you turn on TV");

        if (adorableChild.canYouTurnOnTv()){
            narrator.say("All right, Then can you turn on the TV?");
            adorableChild.turnOnTv(tvWatch);
            return;
        }
    }

    public void adjustTvVolume(){
        //
        narrator.say("Adjust sounds");

        TvWatch tvWatch = livingRoom.getTv();

        if (!tvWatch.isPowerOn()){
            narrator.say("This tv is off. I have to turn it on first and then adjust the sound.");
            return;
        }
        while (feelAsLowVolume(tvWatch)){
            narrator.sayAndSleep("oh ... Let's listen for a moment. ", 4);
            narrator.say(adorableChild.getName() +", up volume on tv? ");
            adorableChild.turnVolumeUp(tvWatch);
        }
    }


    private boolean feelAsLowVolume(TvWatch tvWatch) {
        //
        if (tvWatch.getVolumeLevel() < 4){
            narrator.say("....(listen)...");
            narrator.say("It sound is like it's small... ");
            return true;
        } else {
            narrator.say("It sound is like it normal....");
            return false;
        }
    }

}
