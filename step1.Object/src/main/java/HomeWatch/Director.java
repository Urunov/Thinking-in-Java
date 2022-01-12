package HomeWatch;

import HomeFacilty.Mama;
import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Director implements PlayerTv {
   //
    private String name;
    private Mama mama;
    private LivingRoom  livingRoom;

    private Narrator narrator;

    public Director() {
        //
        this.name = "KimPD";
        this.narrator = new Narrator(this, TalkingAtUs.Left);
        this.prepareScenario();
    }

    @Override
    public String getName() {
        return null;
    }

    public void playTurnOnTvScene(){
        //
        narrator.say(" Mr. %s , possible to listen tv set" );
        mama.listenToTv();
    }
}
