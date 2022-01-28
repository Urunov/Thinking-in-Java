package sikls;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {Operations}
 * @Date: {2022/01/29 && 12:23 AM}
 */
public class ReturnClass {
    //

    static int testC(int v1, int target){
        if (v1>target)
            return +1;
        else if (v1 < target)
            return -1;
        else
            return 0; // Match
    }

    public static void main(String[] args) {
        System.out.println(testC(4, 6));
        System.out.println(testC(4, 26));
        System.out.println(testC(334, 26));
    }
}
