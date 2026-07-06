package level01.day04;

// 양의 정수 n이 매개변수로 주어질 때,
// n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
// n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.


class Prob03 {
    public int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            // n이 짝수일 때: 2부터 n까지 2씩 커지면서 제곱을 더함
            for (int i = 2; i <= n; i += 2) {
                answer += (i * i);
            }
        } else {
            // n이 홀수일 때: 1부터 n까지 2씩 커지면서 그냥 더함
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        }

        // 컴퓨터에게 최종 계산된 숫자 결과만 넘겨줍니다!
        return answer;
    }
}