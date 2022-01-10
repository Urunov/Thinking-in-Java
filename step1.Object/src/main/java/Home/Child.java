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
}
