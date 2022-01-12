package Home;

public class TellUsStory {
    //
    public static void main(String[] args) {
        //
        startStory();
    }

    public static void startStory(){
        //
        Tvs tvs = new Tvs("Tivoli");

        Mama mama  = new Mama("YeongmiMam");
        mama.watchToTV(tvs);

    }
}
