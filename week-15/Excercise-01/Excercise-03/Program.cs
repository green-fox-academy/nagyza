using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Excercise_03
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            IEnumerable<int> positives = from ns in n where ns > 0 select ns * ns;
            foreach (int pos in positives)
            {
                Console.WriteLine(pos);
            }
            Console.ReadKey();
        }
    }
}
