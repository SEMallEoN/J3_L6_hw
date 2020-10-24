import J3_L6_hw.Exercise1;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

public class Exercise1Test {
    private static final Logger log = LoggerFactory.getLogger(Exercise1.class);

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 5, 4, 3, 7, 2}, new int[]{1, 7}, "Case 1"},
                {new int[]{7, 3, 5, 8, 2, 1}, new int[]{1, 3}, "Case 2"},
                {new int[]{4, 2, 9}, new int[]{2, 9}, "Case 3"}
        });
    }

    private int[] arrOriginal;
    private int[] arrExpected;
    private String message;

    @Test
    public void Exercise1Test() {
        log.error(message + ": отправили массив: " + Arrays.toString(arrOriginal) + " получили массив: " + Arrays.toString(arrExpected));
        assertArrayEquals("Заданный нами массив должен совпадать с полученным", arrExpected, Exercise1.process(arrOriginal));
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionTask1() {
        log.error("Тест на появление RuntimeException");
        Exercise1.process(new int[]{1, 2, 3});
    }
}
