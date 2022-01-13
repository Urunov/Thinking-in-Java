package HomeMenu;

import HomeMenu.ui.TvSetCli;

public class HomeMenu {
    //
    public static void main(String[] args) {
        //
        startedBook();
    }

    public static void startedBook(){
        //
        (new TvSetCli()).showMenuAndAction();
    }
}
