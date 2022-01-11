package Home;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Mama implements PlayerTv {
   //
    private String name;
    private Child adorableChild;

    private Narrator narrator;

    public Mama(String name) {
        //
        this.name = name;
        this.adorableChild = new Child("Alex", 5);
        this.narrator = new Narrator(this, TalkingAtUs.Left);
    }

    @Override
    public String getName() {
        return name;
    }

    public void watchToTV(Tvs tvs){
        //
        narrator.say("Is that so, I will watch to the tv");

        narrator.say(adorableChild.getName() + " Can you turn on the TV?");
        if(adorableChild.canYouTurnOnTv()){
            narrator.say("Okay, so can you turn on the TV?");
            adorableChild.turnOnTV(tvs);
            return;
        }
    }
}
