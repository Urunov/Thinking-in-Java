package sikls;

import java.util.Random;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {Operations}
 * @Date: {2022/01/28 && 10:50 PM}
 */
public class ForeachIn {
    public static void main(String[] args) {
        Random random = new Random(47);
        float f[] = new float[10];
        for (int i=0; i <10; i++){
            f[i] = random.nextFloat();
        }
        for (float xf : f){
            System.out.println(xf);
        }
    }
}
