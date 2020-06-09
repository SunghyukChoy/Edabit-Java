package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CanNestTests {
    @Test
    public void test1() {
        assertThat(Challenge.canNest(new int[] { 1, 2, 3, 4 }, new int[] { 0, 6 }), is(true));
    }

    @Test
    public void test2() {
        assertThat(Challenge.canNest(new int[] { 3, 1 }, new int[] { 4, 0 }), is(true));
    }

    @Test
    public void test3() {
        assertThat(Challenge.canNest(new int[] { 9, 9, 8 }, new int[] { 8, 9, 10 }), is(false));
    }

    @Test
    public void test4() {
        assertThat(Challenge.canNest(new int[] { 9, 9, 8 }, new int[] { 8, 9 }), is(false));
    }

    @Test
    public void test5() {
        assertThat(Challenge.canNest(new int[] { 1, 2, 3, 4 }, new int[] { 2, 3 }), is(false));
    }

}