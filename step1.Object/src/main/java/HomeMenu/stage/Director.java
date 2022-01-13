package HomeMenu.stage;

import HomeMenu.player.Children;
import HomeMenu.player.Mamy;
import HomeMenu.player.TvSet;
import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Director implements PlayerTv {
    //
    private String name;
    private Mamy mamy;
    private LivingRoom livingRoom;

    private Narrator narrator;

    public Director() {
        //
        this.name = "Petrov A.I";
        this.narrator = new Narrator(this, TalkingAtUs.Left);
        this.prepareScenario();
    }

    public void playAdjustVolumeScene(){
        //
        narrator.say(String.format("%s Could you please adjust the sound?", mamy.getName()));
        mamy.adjustTvSetVolume();
    }

    private void prepareScenario() {
        //
        narrator.say("We prepare the stage for the play...");
        this.livingRoom = buildLivingRoom();
        this.mamy = inviteMinSooMom("Yura", livingRoom);

        Children minsoo = mamy.callSon("Minsoon");
        livingRoom.enter(minsoo);

        TvSet tvSet = shopTvSet("LG");
        livingRoom.setUp(tvSet);
    }

    private Mamy inviteMinSooMom(String name, LivingRoom livingRoom) {
        //
        narrator.say(String.format("%s invite", name));
        return new Mamy(name, livingRoom);
    }

    private TvSet shopTvSet(String brandName) {
        //
        narrator.say(String.format("%s buy a brand tv set"));
        return new TvSet(brandName);
    }

    private LivingRoom buildLivingRoom(){
        //
        narrator.say("Create a living room.");
        LivingRoom livingRoom = new LivingRoom();
        return livingRoom;
    }

    @Override
    public String getName() {
        return name;
    }
}
