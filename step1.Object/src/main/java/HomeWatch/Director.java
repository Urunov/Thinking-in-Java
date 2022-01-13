package HomeWatch;

import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Director implements PlayerTv {
   //
    private String name;
    private Mama1 mama1;
    private LivingRoom  livingRoom;

    private Narrator narrator;

    public Director() {
        //
        this.name = "Molotov A.P";
        this.narrator = new Narrator(this, TalkingAtUs.Left);

        this.prepareScenario();
    }

    @Override
    public String getName() {
        return name;
    }

    public void playTurnOnTvScene(){
        //
        narrator.say(String.format(" Mr. %s , possible to listen tv set", mama1.getName()));
        mama1.adjustTvVolume();
    }

    public void playAdjustVolumeScene(){
        //
        narrator.say(String.format("Mss. %s, Could you please adjust the sound?", mama1.getName()));
        mama1.adjustTvVolume();
    }

    private void prepareScenario(){
        //
        narrator.say("We prepare the stage for the play...");
        this.livingRoom = buildLivingRoom();
        this.mama1 = inviteMinsooMama("Alica", livingRoom);

        livingRoom.enter(mama1.callSon());
        livingRoom.setUp(shopTv("... LG ..."));
    }

    private Mama1 inviteMinsooMama(String name, LivingRoom livingRoom){
        narrator.say(String.format(" Mss. %s invite ", name));
        return new Mama1(name, livingRoom);
    }

    private LivingRoom buildLivingRoom(){
        //
        narrator.say("Create a living room.");
        LivingRoom livingRoom = new LivingRoom();
        return livingRoom;
    }
    private TvWatch showTv(String brandName){
        //
        narrator.say(String.format("Mr. %s buy a brand TV", brandName));
        return new TvWatch(brandName);
    }

    private TvWatch shopTv(String brandName){
        //
        narrator.say(String.format("%s buy a brand tv.", brandName));
        return new TvWatch(brandName);
    }

}
