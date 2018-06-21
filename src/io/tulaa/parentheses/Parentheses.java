package io.tulaa.parentheses;

/**
 * Created by admin on 6/21/18.
 */

/**
 * Fredrick Oluoch
 * http://www.blaqueyard.com
 * 0720106420 | 0722508906
 * email: menty44@gmail.com
 */

public class Parentheses {

    public static void main (String[] args)
    {
        int n = 3;
        char[] str = new char[6];
        printParenthesis(str, n);
    }

    // Function that print all combinations of
    // balanced parentheses
    // open store the count of opening parenthesis
    // close store the count of closing parenthesis
    static void _printParenthesis(char str[], int pos, int n, int open, int close)
    {
        if(close == n)
        {
            // print the possible combinations
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]);
            System.out.println();
            return;
        }
        else
        {
            if(open > close) {
                str[pos] = '}';
                _printParenthesis(str, pos+1, n, open, close+1);
            }
            if(open < n) {
                str[pos] = '{';
                _printParenthesis(str, pos+1, n, open+1, close);
            }
        }
    }

    // Wrapper over _printParenthesis()
    static void printParenthesis(char str[], int n)
    {
        if(n > 0){
            _printParenthesis(str, 0, n, 0, 0);
        }else {
            System.out.println("error");
        }

        return;
    }
}
