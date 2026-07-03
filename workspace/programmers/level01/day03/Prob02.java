package level01.day03;


//문자들이 담겨있는 배열 arr가 주어집니다.
// arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

class Prob02 {
    public String solution(String[] arr) {
        // 배열의 원소들을 구분자 없이("") 그대로 이어 붙입니다.
        return String.join("", arr);
    }
}
