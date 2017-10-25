using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution
{

    static int birthdayCakeCandles(int n, int[] ar)
    {
        // Complete this function
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++)
        {

            if (ar[i] > max)
            {
                max = ar[i];
                count = 0;
            }
            if (ar[i] == max)
            {
                count++;
            }
        }
        return count;
    }

    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] ar_temp = Console.ReadLine().Split(' ');
        int[] ar = Array.ConvertAll(ar_temp, Int32.Parse);
        int result = birthdayCakeCandles(n, ar);
        Console.WriteLine(result);
    }
}
