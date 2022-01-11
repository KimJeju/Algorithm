#include <iostream>

using namespace std;

int main() {
    string s; //문자열 함수 string
    getline(cin,s); // 스트링을 받아올 때는 getline(cin,string 변수) || char을 받아올때는 cin.getline(char 변수)
    cout << s;
}

//장문 반환 함수 