package excersize;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {Operations}
 * @Date: {2022/01/26 && 8:30 PM}
 */
public class Dog {
    //
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }


    public static void main(String[] args) {

        Dog spot = new Dog("ruf", "Ruff");
        Dog scruff = new Dog("wurf", "Wurf!");

        System.out.println("1. " + spot.name + " " + spot.says);
        System.out.println("2. " + scruff.name + " " + spot.says);
    }

}
