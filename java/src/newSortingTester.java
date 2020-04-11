import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class newSortingTester {


    @Test
    public void test1() {   // tests a null array //
        newSorting test = new newSorting();
        int[] array = {};
        test.newSorting1(array, 0);
        int[] expected = {};
        assertArrayEquals(expected, array);
    }

    @Test
    public void test2() {   // tests an array with one element //
        newSorting test = new newSorting();
        int[] array = {129};
        test.newSorting1(array, 2);
        int[] expected = {129};
        assertArrayEquals(expected, array);
    }

    @Test
    public void test3() {   // tests if it can sort 2 elements properly //
        newSorting test = new newSorting();
        int[] array = {27, 13};
        test.newSorting1(array, 3);
        int[] expected = {13, 27};
        assertArrayEquals(expected, array);
    }

    @Test
    public void test4() {   // tests negative and zeroes //
        newSorting test = new newSorting();
        int[] array = {4, 12, -1, 0};
        test.newSorting1(array, 2);
        int[] expected = {-1, 0, 4 ,12};
        assertArrayEquals(expected, array);
    }

    @Test
    public void test5() { // tests repeating elements //
        newSorting test = new newSorting();
        int[] array = {1, 1, 1, 1, 1};
        test.newSorting1(array, 4);
        int[] expected = {1, 1, 1, 1, 1};
        assertArrayEquals(expected, array);
    }
}
