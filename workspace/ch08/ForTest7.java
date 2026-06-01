package ch08;

public class ForTest7 {
    public static void main(String[] args) {
        //continue를 이용한 홀수 합계
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i % 2 == 0) { // 짝수일 떄
                continue;
            }
            sum+=i;
        }
        System.out.println("1~100 홀수 합계: " + sum);

        // 1~100 합계
        int num = 1;
        sum = 0;
        while (num<=100){
            sum +=num; // 0,1,3,6,10,15......
            num++; // 1,2,3,4,....

            if (num >100){
                // 만약에 100을 넘는다면 멈춰라
                break; //while 은 중단
            }
        }
        System.out.println("1~100 합계 " + sum);


    }
}
