package ch05;

public class PrimitiveType_2 {
    void main (){
        int age; // 1 . 변수 선언
        age = 25; // 2. 변수에 값 할당
        System.out.println(age);
        age = 30; // 변수에 값을 재 할당
        System.out.println(age);

        int score = 100; // 3. 변수 선언과 동시에 값 할당
        System.out.println(score);

        byte b = 127;
        System.out.println(b);

        short s = 10000;
        System.out.println(s);

        int num = 10000000;
        System.out.println(num);

        long bigNum = 1000000;
        System.out.println(bigNum);

        double pi = 3.141592;
        // 반지름이 5인 원의 넓이를 계산
        System.out.println(pi * 5 * 5);
        // 반지름이 4인 원의 넓이를 계산
        System.out.println(pi * 4 * 4);

        float shortPi = 3.14F;
        // 여기서 F 빼변 long 타입이 됨
        System.out.println(shortPi);

        boolean isGood = true;
        System.out.println(isGood);

        boolean isMan = false;
        System.out.println(isMan);

        // 글자 하나 표현 할 떄
        char grade = 'A';
        System.out.println(grade);

        // 같은 변수 두번 선언 x  ex) char grade = 'B';
        grade = 'B';
        System.out.println(grade);

        // 문자열 : 2글자 이상의 문자들을 저장
        // 큰따옴표로 문자를 묶어서 표현
        String firstName ="멋쟁이";
        String lastName = "사자처럼";
        System.out.println(firstName);
        System.out.println(lastName);


        // final : 상수 선언  (변하지 않는 값)
        // 상수의 변수는 대문자로 쓴다
        final double PI = 3.14;



        double pi2 = 3.14;
        // 반지름이 5인 원의 넓이를 계산
        System.out.println(pi2 * 5 * 5);
        // 반지름이 4인 원의 넓이를 계산
        System.out.println(pi2 * 4 * 4);




    }
}