package util;

public enum TalkingAtUs {
    //
    Left(0),
    Middle(3),
    Right(6);

    private int tabsCount;

    private TalkingAtUs(int tabsCount){
        this.tabsCount = tabsCount;
    }

    public int tabsCount() {
        return tabsCount();
    }
}
