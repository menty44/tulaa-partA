package io.tulaa.triplets;/**
 * Created by admin on 6/21/18.
 */

/**
 * Fredrick Oluoch
 * http://www.blaqueyard.com
 * 0720106420 | 0722508906
 * email: menty44@gmail.com
 */

public class Triplets {

    public static void main(String[] args)
    {
        int sum = 12;
        System.out.println(countTriplets(arr.length, sum));
    }

    static int arr[] = new int[]{5, 1, 3, 4, 7};
    //static int arr[] = new int[]{-2, 0, 1, 3};

    static int countTriplets(int n, int sum)
    {
        System.out.println("what is n : " + n);
        System.out.println("what is sum : " + sum);

        // Initialize result
        int ans = 0;

        // Fix the first element as A[i]
        for (int i = 0; i < n-2; i++)
        {
            // Fix the second element as A[j]
            for (int j = i+1; j < n-1; j++)
            {
                // Now look for the third number
                for (int k = j+1; k < n; k++)
                    if (arr[i] + arr[j] + arr[k] < sum)
                        ans++;
            }
        }

        return ans;
    }


}
