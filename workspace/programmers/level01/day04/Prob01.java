package level01.day04;

//정수 num과 n이 매개 변수로 주어질 때,
// num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.


class Prob01 {
    public int solution(int num, int n) {
        if (num % n == 0) {
            System.out.println(num + "은 " + n + "의 배수이므로 1을 return합니다.");
            return 1;
        } else {
            System.out.println(num + "은 " + n + "의 배수가 아니므로 0을 return합니다.");
            return 0;
        }
    }
}