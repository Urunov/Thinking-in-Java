package HomeFacilty;

public class HistoryCheck {
    //
    public static void main(String[] args) {
        keepDialog();
    }

    public static void keepDialog(){
        //
        Tv tv = new Tv("LG");
        Mama mama = new Mama("Mamam");

        mama.listenToTv(tv);
        mama.adjustTvVolume(tv);
    }
}
