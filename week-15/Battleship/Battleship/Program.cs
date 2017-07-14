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
            List<int> row = new List<int>();
            for (int i = 0; i < 10; i++)
            {
                row.Add(0);
            }

            for (int i = 0; i < 10; i++)
            {
                gameBoard.BattleField.Add(row);
            }

            foreach (List<int> i in gameBoard.BattleField)
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
