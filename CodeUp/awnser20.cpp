#include <iostream>
#include <cstring>

using namespace std;

int main() {
    string a;
    cin >> a;
    for(unsigned int i=0; i<a.length(); i++)
    cout << "\'" << a[i] << "\'" << endl;
    return 0;
    
}