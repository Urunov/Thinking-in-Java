package util;

public class Narrator {
    //
    private String playerName;
    private String playerClass;
    private TalkingAtUs positions;
    private boolean silentMode;

    public Narrator(PlayerTv playerTv, TalkingAtUs positions) {

        this.playerName = playerTv.getName();
        this.playerClass = playerTv.getClass().getSimpleName();
        this.positions = positions;
    }

    public void justKeepSilent(){
        //
        this.silentMode = false;
    }

    public void say (String message) {
        //
        printOut(appendTabs().append(formatMessage(message)).append("\n"));
    }

    public void sayAndSleep(String message, int seconds){
        //
        say(message);
        sleep(seconds);
    }

    public void sayNewLine(){
        //
        System.out.print("\n");
    }

    private void printOut(StringBuffer message){
        //
        if (!silentMode){
            System.out.print(message.toString());
        } else{
            System.out.print("*");

        }
    }

    private String formatMessage(String message){
        //
        return String.format("<%s: %s> %s", playerName, playerClass, message);
    }

    private StringBuffer appendTabs(){
        //
        StringBuffer buffer = new StringBuffer();

        for(int i=0; i<this.positions.tabsCount(); i++){
            buffer.append("\t");
        }
        return buffer;
    }

    private void sleep(int seconds){
        //
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
