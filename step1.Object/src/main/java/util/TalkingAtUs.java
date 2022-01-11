package util;

public enum TalkingAtUs {
    //
    Left(0),
    Middle(3),
    Right(6);

    private int tabCount;

   private TalkingAtUs(int tabCount){
        this.tabCount = tabCount;
    }

    public int tabCount() {
        return tabCount;
    }
}
