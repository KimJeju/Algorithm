#include <iostream>
using namespace std;

int main() {
    float a;

    cout << fixed; // 소수점 자리고정
    cout.precision(6); // 몇번째 소수점 까지 표현할 것이다
    cin >> a;
    cout << a << endl;
    
}

//소수점 6자리까지 출력 예제 : 1.414213