package ch05;

public class TypeCastingTest {
    static void main() {
        int a = 2100000000;
//        double b = (double) a; // 명시적 형변환(a를 double로 변환, int -> double)
        double b = a; // 자동 형변환(a가 double로 변환)

        System.out.println(a);
        System.out.println(b);

        double pi = 3.14;
        int p = (int) pi; // 명시적 형변환 필요(pi룰 int로 변환, double -> int)

        System.out.println(pi);
        System.out.println(p);



    }
}
