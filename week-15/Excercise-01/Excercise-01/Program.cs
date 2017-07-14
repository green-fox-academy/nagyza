using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Excercise_01
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            IEnumerable<int> evens = from ns in n where ns % 2 == 0 select ns;
            foreach (int ens in evens)
                {
                    Console.WriteLine(ens);
                }
            Console.ReadKey();
        }
    }
}
