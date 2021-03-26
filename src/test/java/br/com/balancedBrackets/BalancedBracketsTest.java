package br.com.balancedBrackets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BalancedBracketsTest {

    @Test
    public void test1() {
        assertEquals(true, BalancedBrackets.areBracketsBalanced("{[()]}'"));
    }

    @Test
    public void test2() {
        assertEquals(false, BalancedBrackets.areBracketsBalanced("'{[(])}'"));
    }

    @Test
    public void test3() {
        assertEquals(true, BalancedBrackets.areBracketsBalanced("{{[[(())]]}}'"));
    }

}
