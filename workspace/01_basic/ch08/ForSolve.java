package ch08;

public class ForSolve {
    public static void main(String[] args) {
        // 1~100 까지의 합계
        int totalSum = 0;
        for (int num = 1; num <= 100; num++){
            totalSum += num;
        }
        System.out.println("1~100 까지의 합계: " + totalSum);


        // 1~100 홀수 합계
        int oddSum = 0;
        for (int num = 1; num <= 100; num += 2){ // 1, 3, 5, 7 ...
            oddSum += num;
        }
        System.out.println("1~100까지 홀수 합계: " + oddSum);


        // 1~100 짝수합계
        int evenSum = 0;
        for (int num = 2; num <= 100; num += 2){
            evenSum += num;
        }
        System.out.println("1~100까지 짝수 합계: " + evenSum);
    }
}
