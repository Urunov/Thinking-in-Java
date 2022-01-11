package Home;


import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

public class Child implements PlayerTv {

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
        return name;
    }

    public boolean canYouTurnOnTv() {
        //
        narrator.say("Can you turn on the TV");

        if (canITurnOnTV()) {
            narrator.say("yes, it is possible");
            return true;
        } else {
            narrator.say("no, it cannot turn on");
            return false;
        }
    }

    public void turnOnTV(Tvs tv) {
        //
        narrator.say("yes, possible");
        tv.turnOn();
    }

    private boolean canITurnOnTV() {
        //
        if (age > 4) {
            narrator.sayAndSleep("Yes I am 5 years now, possible to", 3);
            return true;
        }

        narrator.say("I'm still too young to touch the TV...");
        return false;
    }
}