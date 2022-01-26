package controllingExecution;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {Operations}
 * @Date: {2022/01/26 && 8:46 PM}
 */
public class ExecutionExample {
    //
    static int result = 0;
    static void test(int val1, int target){
        if (val1 > target)
            result++;
        else if (val1 < target)
            result--;
        else
            result=0;

    }

    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);
        test(5, 10);
        System.out.println(result);
        test(4,23);
        System.out.println(result);
    }
}
