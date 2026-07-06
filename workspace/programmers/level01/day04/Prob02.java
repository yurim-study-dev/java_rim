package level01.day04;

// 정수 number와 n, m이 주어집니다.
// number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

class Prob02 {
    public int solution(int number, int n, int m) {

        if(number%n==0 & number%m==0){
            System.out.println(number + "은 " + n + "의 배수이면서" + m + "의 배수이기 때문에 1을 return합니다.");
            return 1;
        }else{
            System.out.println(number + "은 " + n + "의 배수이지만"+ m + "의 배수가 아니기 때문에 0을 return합니다.");
            return 0;
        }

    }
}