package HomeWatch;

import HomeFacilty.Tv;
import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class LivingRoom implements PlayerTv {
    //
    private Child playingChild;
    private Tv tv;

    private Narrator narrator;

    public LivingRoom() {
        //
        this.narrator = new Narrator(this, TalkingAtUs.Left);

    }

    @Override
    public String getName() {
        return null;
    }

    public void enter(Child child){
        //
        narrator.say(String.format("Living room %s here ", child.getName()));
        this.playingChild = child;
    }

    public Child getChild(){
        //
        return playingChild;
    }

    public void setUp(Tv tv){
        //
        narrator.say(String.format("Living room (%s) has tv set.", tv.getName()));
        this.tv = tv;
    }

    public Tv getTv(){
        //
        return tv;
    }

}
