package level01.day03;
// 길이가 같은 두 문자열 str1과 str2가 주어집니다.

// 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서
// 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.


class Prob01 {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();

        // 두 문자열의 길이가 같으므로 str1의 길이만큼 반복합니다.
        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i)); // str1의 i번째 글자 추가
            answer.append(str2.charAt(i)); // str2의 i번째 글자 추가
        }

        return answer.toString();
    }
}