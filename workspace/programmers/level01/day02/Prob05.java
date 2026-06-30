package level01.day02;

//문자열 my_string, overwrite_string과 정수 s가 주어집니다.
// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
// 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를
// 작성해 주세요.


class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 1. 앞부분 자르기
        String before = my_string.substring(0, s);

        // 2. 뒷부분 자르기 (시작 위치 + 덮어쓴 문자열의 길이 이후부터 끝까지)
        String after = my_string.substring(s + overwrite_string.length());

        // 3. 순서대로 합쳐서 반환하기
        return before + overwrite_string + after;
    }
}