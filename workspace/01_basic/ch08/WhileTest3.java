package ch08;

// 6이 나올때까지 주사위를 던져보자!!!

public class WhileTest3 {
    public static void main(String[] args) {
        int testCount = 0;
        // 반복문 안에 반복문 사용 ㅇ
        while(testCount < 100){
            int num = 0;
            int count = 0;

            while (num != 600){
                // Math.random() -> 0~0.9999... 까지 나옴
                num = (int)(Math.random()*600) + 1; // 0이상 5.9999....미만의 수
                System.out.println(num);
                count++;

            }
            System.out.println("반복 횟수 : " + count);
            testCount++;

        }



        }

}
