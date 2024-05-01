package MUI.sample_test;

import junit.framework.TestCase;
import org.junit.Test;

public class exerciseTest extends TestCase {

    @Test
    public void test_middle_value_not_less() {
        int result = exercise.test1(new int[]{1, 2, 3, 4, 5});
        assertEquals(0, result);
    }

    @Test
    public void test_middle_value_less() {
        int result = exercise.test1(new int[]{3, 2, 1, 4, 5});
        assertEquals(1, result);
    }

    @Test
    public void test_middle_value_not_less_2() {
        int result = exercise.test1(new int[]{3, 2, 1, 4, 1});
        assertEquals(0, result);
    }
    @Test
    public void test_middle_value_not_odd() {
        int result = exercise.test1(new int[]{1, 2, 3, 4});
        assertEquals(0, result);
    }
    @Test
    public void test_empty_array() {
        int result = exercise.test1(new int[]{});
        assertEquals(0, result);
    }
    @Test
    public void test_middle_value_less_2() {
        int result = exercise.test1(new int[]{10});
        assertEquals(1, result);
    }


}