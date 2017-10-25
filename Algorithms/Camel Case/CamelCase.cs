using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution
{

    static void Main(String[] args)
    {
        string s = Console.ReadLine();
        char[] letters = s.ToCharArray();
        int count = 1;

        for (int i = 0; i < letters.Length; i++)
        {
            if (char.IsUpper(letters[i])) count++;
        }

        Console.WriteLine(count);
    }
}
