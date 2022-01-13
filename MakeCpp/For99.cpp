#include <iostream>
using namespace std;

int main() {
	
  int a = 1;
  int b = ++a;
  int c = b;
  cout << a << b << c << endl;

  int q = 1;
  int w = q++;
  int e = w;
  cout << q << w << e << endl;

  return 0;
}