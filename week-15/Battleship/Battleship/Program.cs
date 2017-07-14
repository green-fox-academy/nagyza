using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Battleship
{
    class Program
    {
        public static Board gameBoard = new Board();
        static void Main(string[] args)
        {
            int[] row = new int[10];
            for (int i = 0; i < 10; i++)
            {
                row[i] = 0;
            }

            for (int i = 0; i < 10; i++)
            {
                gameBoard.BattleField.Add(row);
            }

            foreach (int[] i in gameBoard.BattleField)
            {
                foreach (int j in i)
                {
                    Console.Write(j);
                }
                Console.WriteLine("");
            }

            Console.ReadKey();
        }
    }
}
