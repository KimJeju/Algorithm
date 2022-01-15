#include <iostream>
using namespace std;

int main(void)
{
	int a, b;
	cin >> a;
	cin.ignore(256, ':');
	cin >> b;
	cout << a << ":" << b << endl;
	return 0;
}