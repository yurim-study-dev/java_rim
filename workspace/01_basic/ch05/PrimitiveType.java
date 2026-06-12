package ch05;

public class PrimitiveType {

    public static void main(String[] args) {

        // 선언과 동시에 값 할당
        int age = 26;
        System.out.println(age);

        // 선언 이후 값 할당
        int birthday;           // 변수 선언
        birthday = 20010217;    // 값 할당
        System.out.println(birthday);

        birthday = 20020216;    // 값 재할당
        System.out.println(birthday);


        // 한 번에 여러 개의 변수 선언
        int score1, score2, sum, avg;
        score1 = 100; score2 = 80;
        sum = score1 + score2;
        avg = sum / 2;
    }
}