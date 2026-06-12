package ch07;
// 입력한 숫자가 3의 배수일 경우 "3의 배수입니다. " 를 출력하고
// 그렇지 않을 경우 "3의 배수가 아닙니다."를 출력하세요
public class IfTest {
    public static void main(String[] args) {
        int num = 16;

//        if(num % 3 == 0){
//            System.out.println(num + " : 3의 배수입니다.");
//        }
//        if(num % 3 != 0){
//            System.out.println(num + " : 3의 배수가 아닙니다.");
//        }

        if(num % 3 == 0){
            // 조건문이 true 일 경우 실행되는 블럭
            System.out.println(num + " : 3의 배수입니다.");
        } else if (num % 2 == 0) {
            System.out.println(num + " : 짝수 입니다");
        } else   {
            // 조건문이 false일 경우 실행되는 블럭
            System.out.println(num + " : 홀수입니다");
        }

    }
}
