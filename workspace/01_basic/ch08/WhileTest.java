package ch08;

// 1부터 지정한 수까지의 합계를 구하시오.
public class WhileTest {
    public static void main(String[] args) {
        // 명령형 매개변수
        // java ch08.WhileTest 10 20
        // args[0] -> 10
        // args[0] -> 20
        int num = Integer.parseInt(args[0]);
        int i = 1;
        int sum = 0;

        while(i <= num ) {
            sum += i;
            System.out.println("i : " + i + ", sum : " + sum);
            i++;
        }

        System.out.println("1부터 " +num + "까지의 합계 : " +sum );
    }
}
