package io.tulaa.Pythagorean;

/**
 * Created by admin on 6/21/18.
 */

/**
 * Fredrick Oluoch
 * http://www.blaqueyard.com
 * 0720106420 | 0722508906
 * email: menty44@gmail.com
 */

public class Pythagorean {

    public static void main(String[] args)
    {
        int ar[] = {3, 1, 4, 6, 5};
        int ar_size = ar.length;
        if(Triplet(ar,ar_size)==true)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }


    // Returns true if there is Pythagorean triplet
    static boolean Triplet(int ar[], int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=i+1; j<n; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    // Calculate square of array elements
                    int x = ar[i]*ar[i], y = ar[j]*ar[j], z = ar[k]*ar[k];

                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }

        // If we reach here, no triplet found
        return false;
    }
}
