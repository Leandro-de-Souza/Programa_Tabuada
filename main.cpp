#include <iostream>

using namespace std;

int main()
{

       int i, N, x, multiplicacao;

       cout << "Deseja a tabuada para qual valor? ";
       cin >> N;

       multiplicacao = 0;

       for(i = 1; i <= 10; i++) {
         multiplicacao = N * i;
         cout << N << " x " << i << " = " << multiplicacao << endl;
       }


    return 0;
}
