package objects;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {Operations}
 * @Date: {2022/01/26 && 8:11 PM}
 */
public class ObjectEquivImp {
    //
    public static void main(String[] args) {
        ObjectVal val1 = new ObjectVal();
        ObjectVal val2 = new ObjectVal();
        val1.value = 100;
        val2.value = 100;

        System.out.println("Equals of the object: "+ val1.equals(val2));
        System.out.println( val1==val2);
    }
  /****
   *
   things are confusing again: The result is false.
   This is because the default behavior of equals( ) is to compare references.
   So unless you override equals( ) in your new class you won’t get the desired behavior.
   Unfortunately, you won’t learn about overriding until the Reusing Classes chapter and
   about the proper way to define equals( ) until the Containers in Depth chapter,
   but being aware of the way equals( ) behaves might save you some grief in the meantime.
   *
   * */
}
