package sikls;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {Operations}
 * @Date: {2022/01/28 && 10:14 PM}
 */
public class SiklToLetter {
    //
    public static void main(String[] args) {
        for (char let = 0; let < 128; let++){
            if (Character.isLowerCase(let))
                System.out.println("value : " + (int) let + " character: " + let);
        }
    }
}
