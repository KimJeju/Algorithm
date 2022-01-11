#include <iostream>
#include <ctime> //시간 헤더파일
using namespace std;



int main() {
    time_t timer = time(NULL); // time() 함수를 호출하여 현재의 날짜, 시간을 얻어 time_t 변수에 저장
    struct tm* t = localtime(&timer); //localtime() 함수를 호출하여 포맷으로 변환

// struct 구조체 생성   
   struct tm
{
   int tm_sec;         // 초,  range 0 to 59
   int tm_min;         // 분, range 0 to 59
   int tm_hour;        // 시간, range 0 to 23
   int tm_mday;        // 일, range 1 to 31
   int tm_mon;         // 월, range 0 to 11
   int tm_year;        // 1900년 부터의 년
   int tm_wday;        // 요일, range 일(0) to 토(6)
   int tm_yday;        // 1년 중 경과 일, range 0 to 365
   int tm_isdst;       // 섬머타임 실시 여부 (양수, 0, 음수)
};

cout << t->tm_hour << ":" << t->tm_min << endl;
  

}

//시간출력예제