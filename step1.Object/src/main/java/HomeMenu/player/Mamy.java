package HomeMenu.player;

import HomeMenu.stage.LivingRoom;
import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

import java.util.ArrayList;
import java.util.List;

public class Mamy implements PlayerTv {
    //
    private String name;
    private List<Children> adorableChildren;
    private LivingRoom livingRoom;

    private Narrator narrator;

    public Mamy(String name, LivingRoom livingRoom) {
        //
        this.name = name;
        this.livingRoom = livingRoom;
        this.inviteSons();

        this.narrator = new Narrator(this, TalkingAtUs.Left);
    }


    @Override
    public String getName() {
        return name;
    }

    public Children callSon(String name){
        //
        for (Children mySon: adorableChildren){
            if (mySon.getName().equals(name)){
                return mySon;
            }
        }
        throw new RuntimeException("No such a son named: " + name);
    }

    private void turnOnRadioByMyself(TvSet tvSet){
        //
        narrator.say("I'll have to turn on the radio myself...");
        tvSet.turnOn();
    }
    private Children findChildInOrder(int order){
        //
        if (this.adorableChildren.size() < (order -1)){
            throw new RuntimeException("I don't know how many sons he has..");
        }
        return adorableChildren.get(order-1);
    }

    private void waitAndListen(int seconds){
        //
        narrator.say("Let's listen for a moment.");

        try {
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public void watchOnTvSet(){
        //
        narrator.say("That's right, I'll listen to the radio.");

        if (!livingRoom.containTvSet()){
            narrator.say("no tv set ");
            return;
        }

        TvSet tvSet = livingRoom.findTv();

        if (tvSet.isPowerOn()){
            narrator.say(" the radio is already on ");
            return;
        }

        String childName = findChildInOrder(1).getName();

        if (livingRoom.existChildren(childName)){
            //
            Children smartChild = livingRoom.findChild(childName);
            narrator.say(smartChild.getName() + ", Can you turn on the radio? ");

            if (smartChild.canYouTurnOnTv()){
                narrator.say("Okay, so can you turn on the radio?");
                smartChild.turnOnTvSet(tvSet);
                return;
            }
        }
        this.turnOnRadioByMyself(tvSet);
    }

    public void adjustTvSetVolume(){
        //
        narrator.say("I'll adjust the sound.");

        if (!livingRoom.containTvSet()){
            narrator.say("No any tv set");
            return;
        }

        TvSet tvSet = livingRoom.findTv();


        if (tvSet.isPowerOn()){
            narrator.say("The tv set is off. Turn it on first and adjust the sound");
            return;
        }

        narrator.say("Is that so, I'll adjust the sound");

        if (!feelAsLowVolume(tvSet)){
            return;
        }

        String childName = findChildInOrder(1).getName();
        if (livingRoom.existChildren(childName)){
            //
            Children smartSon = livingRoom.findChild(childName);
            if (smartSon.canYouAdjustVolume()){
                adjustTvSetVolumeBySon(smartSon, tvSet);
                return;
            }
        }
        adjustTvSetVolume();
    }

    private void adjustTvSetVolumeBySon(Children children, TvSet tvSet){
        //
        while (feelAsLowVolume(tvSet)){
            this.waitAndListen(4);
            narrator.say(children.getName() + "Can you turn the volume up a little?");
            children.turnVolumeUp(tvSet);
        }
    }

    private void adjustRadioVolumeByMySelf(TvSet tvSet){
        //
        while (feelAsLowVolume(tvSet)){
            waitAndListen(4);
            narrator.say("I need to turn the volume up a bit");
            tvSet.turnVolumeUp();
        }
    }

    private boolean feelAsLowVolume(TvSet tvSet){
        //
        if (tvSet.getVolumeLevel() < 4){
            narrator.say("....(listen)....");
            narrator.say(" the sound seems low ");
            return true;
        } else {
            narrator.say("the sound seems normal ");
            return false;
        }
    }
    private void inviteSons() {
        //
        this.adorableChildren = new ArrayList<Children>();
        this.adorableChildren.add(new Children("Urunov", 5));
        this.adorableChildren.add(new Children("Terrance", 3));
    }

}
