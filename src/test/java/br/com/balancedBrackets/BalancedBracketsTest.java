package br.com.balancedBrackets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BalancedBracketsTest {

    @Test
    public void areBracketsBalancedTest1() {

        assertEquals(true, BalancedBrackets.areBracketsBalanced("{[()]}'"));

    }

    @Test
    public void areBracketsBalancedTest2() {

        assertEquals(false, BalancedBrackets.areBracketsBalanced("'{[(])}'"));

    }

    @Test
    public void areBracketsBalancedTest3() {

        assertEquals(true, BalancedBrackets.areBracketsBalanced("{{[[(())]]}}'"));

    }

}
