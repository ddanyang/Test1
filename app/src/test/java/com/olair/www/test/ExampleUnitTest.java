package com.olair.www.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    int count = 0;

    void upStair(int N, int n, int sum) {
        if (sum == N) {
            count++;
            return;
        } else if (sum > N) {
            return;
        }
        if (n == 0) {
            return;
        }
        upStair(N, n - 1, sum + 2);
        upStair(N, n - 1, sum + 1);
    }

    public int climbStairs(int n) {
        count = 0;
        upStair(n, n, 0);
        return count;
    }

    @Test
    public void test() {

    }

}