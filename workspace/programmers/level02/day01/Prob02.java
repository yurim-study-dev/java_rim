/* 두 수의 차 구하기

 * [문제 설명]
 * 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 solution 함수를 완성해주세요.
 *
 * [제한사항]
 * -50,000 <= num1 <= 50,000
 * -50,000 <= num2 <= 50,000
 *
 * [입출력 예]
 * num1 | num2 | result
 * 2 | 3 | -1
 * 100 | 2 | 98
 *
 * [입출력 예 설명]
 * 예제 1번: num1이 2이고 num2가 3이므로 2 - 3 = -1을 return합니다.
 * 예제 2번: num1이 100이고 num2가 2이므로 100 - 2 = 98을 return합니다.
 */

package level02.day01;

public class Prob02 {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    void main() {
        System.out.println(solution(2, 3));
        System.out.println(solution(100, 2));
    }
}