package HomeWatch;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class LivingRoom implements PlayerTv {
    //
    private Child1 playingChild;
    private TvWatch tvWatch;

    private Narrator narrator;

    public LivingRoom() {
        //
        this.narrator = new Narrator(this, TalkingAtUs.Left);

    }

    @Override
    public String getName() {
        return "Here is living room";
    }

    public void enter(Child1 child1){
        //
        narrator.say(String.format("Living room %s here ", child1.getName()));
        this.playingChild = child1;
    }

    public Child1 getChild(){
        //
        return playingChild;
    }

    public void setUp(TvWatch tv){
        //
        narrator.say(String.format("Living room (%s) has tv set.", tv.getName()));
        this.tvWatch = tv;
    }

    public TvWatch getTv(){
        //
        return tvWatch;
    }

}
