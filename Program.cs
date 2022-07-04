using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROBLEMA_TABUADA {
    internal class Program {
        static void Main(string[] args) {

            int i, N, multiplicacao;

            Console.Write("Deseja a tabuada para qual valor? ");
            N = int.Parse(Console.ReadLine());

            multiplicacao = 0;

            for (i = 1; i <= 10; i++) {
                multiplicacao = N * i;
                Console.WriteLine(N + " x " + i + " = " + multiplicacao);
            }
        }
    }
}
