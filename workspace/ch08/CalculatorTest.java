package ch08;

import java.util.Scanner;

public class CalculatorTest {

    // 계산기
    // 5+4 ->5+4 = 9
    // 4*2 ->4*2 =8
    public static void main(String[] args) {
        System.out.println("*** 계산기 프로그램 ***");
        System.out.println("계산식을 입력하세요.(예시, 5+4)");
        Scanner s = new Scanner(System.in); // 입력받는거

        System.out.printf("첫번째 숫자를 입력하세요 : ");
        int num1 = s.nextInt();
        System.out.printf("연산자를 입력하세요 ( 보기 : + , - , * , / ) : ");
        String operator = s.next();
        System.out.printf("두번째 숫자를 입력하세요 : ");
        int num2 = s.nextInt();

        String result = switch (operator){
            case "+" -> num1 + " " + operator + " " + num2 + " = "  + (num1 + num2);  // 형변환
            case "-" -> num1 + " " + operator + " " + num2 + " = "  + (num1 - num2);
            case "*" -> num1 + " " + operator + " " + num2 + " = "  + (num1 * num2);
            case "/" -> num1 + " " + operator + " " + num2 + " = "  + ((double)num1 / num2); // 나누기 했을때만 소수점 나오게 !! (double)로 형변환 시켜줌

            default -> "수식에 오류가 있습니다.";
        };

        System.out.println(result);

    }
}
