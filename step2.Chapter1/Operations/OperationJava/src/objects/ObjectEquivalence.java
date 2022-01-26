package objects;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {Operations}
 * @Date: {2022/01/26 && 8:10 PM}
 */
public class ObjectEquivalence {
    //
    public static void main(String[] args) {
        Integer num1 = new Integer(47);
        Integer num2 = new Integer(47);


        System.out.println(num1==num2); // false


        /***************
         *  the contents of the objects are the same, the references are not the same.
         *  The operators == and != compare object references,
         *  so the output is actually “false” and then “true.”
         * */
        System.out.println(num1.equals(num2)); // true

        System.out.println(num1 !=num2); // true

        /***
         *  if you want to compare the actual contents of an object for equivalence?
         *  You must use the special method equals( ) that exists for all objects
         *  (not primitives, which work fine with == and !=).
         * */
    }
}
