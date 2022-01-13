package HomeMenu.stage;

import HomeMenu.exception.NoChildException;
import HomeMenu.exception.NoTVException;
import HomeMenu.player.Children;
import HomeMenu.player.TvSet;
import util.Narrator;
import util.PlayerTv;
import util.TalkingAtUs;

import java.util.ArrayList;
import java.util.List;

public class LivingRoom implements PlayerTv {
    //
    private List<Children> playingChildren;
    private TvSet tvSet;
    private Narrator narrator;

    public LivingRoom() {
        //
        this.playingChildren = new ArrayList<Children>();
        this.narrator = new Narrator(this, TalkingAtUs.Left);
    }

    @Override
    public String getName() {
        return "living room";
    }

    public void enter(Children children){
        //
        narrator.say(String.format("Adorable child (%s) entering the living room", children.getName()));
        this.playingChildren.add(children);
    }

    public boolean existChildren(String name){
        //
        for (Children children: playingChildren){
            //
            String childName = children.getName();
            if (childName.equals(name)){
                return true;
            }
        }
        return false;
    }

    public Children findChild(String name){
        //
        for (Children children: playingChildren){
            //
            String childrenName = children.getName();
            if(childrenName.equals(name)){
                return children;
            }
        }
        throw new NoChildException(name + "is not here");
    }

    public void setUp(TvSet tvSet){
        //
        narrator.say(String.format("Install a tv (%s) in the living room", tvSet.getName()));
        this.tvSet = tvSet;
    }

    public boolean containTvSet() {
        //
        if (tvSet !=null){
            return true;
        }
        return false;
    }

    public TvSet findTv(){
        //
        if (tvSet == null){
            throw new NoTVException("NO any tv set");
        }

        return tvSet;
    }

}
