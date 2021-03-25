package br.com.balancedBrackets;


import java.util.Deque;
import java.util.LinkedList;

/**
 * https://www.hackerrank.com/challenges/balanced-brackets/problem
 */
public interface BalancedBrackets {

    static boolean areBracketsBalanced(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']')
                        || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                    if (deque.isEmpty()) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
