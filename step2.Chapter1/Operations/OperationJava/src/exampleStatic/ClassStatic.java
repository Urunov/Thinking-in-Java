package exampleStatic;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {Operations}
 * @Date: {2022/01/26 && 9:29 PM}
 */
public class ClassStatic {
    //
    // static variable
    static int a = 10;
    static int b;

    // static block
    static {
        System.out.println(
                "static block initialized."
        );
        b = a * 4;
    }


    // static method
    static void m1(){
        System.out.println("From m1");
    }

    public static void main(String[] args) {
        // calling m1 without creating
        // any object of class Test
        m1();

        System.out.println("From main rresult");
        System.out.println(" value of a : " + a );
        System.out.println(" value of b : " + b);
    }
}
