package level01.day03;

// 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.



class Prob04 {
    public int solution(int a, int b) {
        // 1. a와 b를 문자열로 붙인 뒤 숫자로 변환합니다.
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);

        // 2. 삼항 연산자를 사용해 더 큰 값을 반환합니다. (같다면 ab 반환)
        return ab >= ba ? ab : ba;
    }
}