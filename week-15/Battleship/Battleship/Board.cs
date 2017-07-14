using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Battleship
{
    class Board
    {
        private int[] _BattleFieldRow = new int[10];
        private List<int[]> _BattleField = new List<int[]>();

        public int[] BattleFieldRow { get => _BattleFieldRow; set => _BattleFieldRow = value; }
        public List<int[]> BattleField { get => _BattleField; set => _BattleField = value; }
    }
}
