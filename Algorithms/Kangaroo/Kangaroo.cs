using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution
{

    static string kangaroo(int x1, int v1, int x2, int v2)
    {
        // Complete this function

        int distance = 1000000;
        int[] travel1 = new int[distance];
        int[] travel2 = new int[distance];
        string finalAnswer = "NO";
        if ((((x1 <= x2) && (v1 <= v2))) || (((x2 <= x1) && (v2 <= v1))))
        {
            finalAnswer = "NO";
        }
        else
        {

            for (int i = 0; i < distance; i++)
            {
                travel1[i] = x1 + (v1 * i);
                travel2[i] = x2 + (v2 * i);
                if (travel1[i] == travel2[i])
                {
                    finalAnswer = "YES";
                }
            }

        }
        return finalAnswer;
    }

    static void Main(String[] args)
    {
        string[] tokens_x1 = Console.ReadLine().Split(' ');
        int x1 = Convert.ToInt32(tokens_x1[0]);
        int v1 = Convert.ToInt32(tokens_x1[1]);
        int x2 = Convert.ToInt32(tokens_x1[2]);
        int v2 = Convert.ToInt32(tokens_x1[3]);
        string result = kangaroo(x1, v1, x2, v2);
        Console.WriteLine(result);
    }
}
