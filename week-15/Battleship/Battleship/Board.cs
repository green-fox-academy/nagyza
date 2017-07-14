using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Battleship
{
    class Board
    {
        private List<int> _BattleFieldRow = new List<int>();
        private List<List<int>> _BattleField = new List<List<int>>();

        public List<int> BattleFieldRow { get => _BattleFieldRow; set => _BattleFieldRow = value; }
        public List<List<int>> BattleField { get => _BattleField; set => _BattleField = value; }
    }
}
