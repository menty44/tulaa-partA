package io.tulaa.pascal;/**
 * Created by admin on 6/21/18.
 */

import java.util.LinkedList;
import java.util.List;

/**
 * Fredrick Oluoch
 * http://www.blaqueyard.com
 * 0720106420 | 0722508906
 * email: menty44@gmail.com
 */

public class Pascal {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println(getRow(i));
        }
    }

    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) {
            return null;
        }
        LinkedList<Integer> current = new LinkedList<Integer>();
        LinkedList<Integer> next = new LinkedList<Integer>();

        current.add(1);
        int start = 0;

        while (start < rowIndex) {
            current.addFirst(0);
            current.add(0);

            calculateNext(current, next);

            LinkedList<Integer> temp = next;
            next = current;
            current = temp;
            start++;

        }

        return current;
    }

    private static void calculateNext(LinkedList<Integer> current, LinkedList<Integer> next) {
        if (current == null) {
            return;
        }
        while (current.size() > 1) {
            int num1 = current.pop();
            int num2 = current.peek();
            next.add(num1 + num2);
        }
        current.clear();
    }

}
