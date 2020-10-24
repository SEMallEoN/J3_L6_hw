package J3_L6_hw;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class Exercise1 {
    private static final Logger log = LoggerFactory.getLogger(Exercise1.class);

    public static void main(String[] args) {
        final int[] res2 = process(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(res2);
    }

    public static int[] process(int[] arrIn) {
        int[] backArr = new int[2];
        if (arrIn.length == 0) {
            log.error("В массиве нет элементов");
            return arrIn;
        }
        for (int i = arrIn.length - 3; i >= 0; i--) {
            if (arrIn[i] == 4) {
                System.arraycopy(arrIn, (i + 1), backArr, 0, 2);
                return backArr;
            }
        }
        throw new RuntimeException("В массиве нет ни одной 4-ки после которой были бы числа");
    }
}
