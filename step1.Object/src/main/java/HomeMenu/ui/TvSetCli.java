package HomeMenu.ui;

import HomeMenu.stage.Director;

import java.util.Scanner;

public class TvSetCli {
    //
    private Director director;
    private Scanner scanner;

    public TvSetCli() {
        //
        this.director = new Director();
        this.scanner = new Scanner(System.in);
    }

    public void showMenuAndAction(){
        //
        while (true) {
            System.out.println("");
            System.out.println("....................");
            System.out.println("Listen to the TV set while working menu");
            System.out.println(".....................");
            System.out.println(" 0. Program exit ");
            System.out.println(" 1. turn on the radio ");
            System.out.println(" 2. radio sound adjustment ");

            int inputNumber = acceptMenuItem("Select number");

            switch (inputNumber) {
                case 1:
                    turnOnTvSet();
                    break;
                case 2:
                    adjustTheVolume();
                    break;
                case 0:
                    exitProgram();
                    return;

                default:
                    System.out.println("Choose again!");
            }
        }
    }

    public int acceptMenuItem(String message){
        //
        System.out.print(message + ": ");
        String inputText = scanner.nextLine();

        try{
            return Integer.valueOf(inputText);
        } catch (NumberFormatException e){
            System.out.println("You entered an incorrect value. Please enter only numbers");
            return 999;
        }
    }

    public void turnOnTvSet(){
        //
        director.playAdjustVolumeScene();
    }
    public void adjustTheVolume(){
        director.playAdjustVolumeScene();
    }


    private void exitProgram() {
        //
        System.out.println("Program exit.");
        scanner.close();
    }
}
