package ch08;

// 1~9 구구딘
// 2 * 1 = 2  3 * 1 = 3  4 * 1 = 4 ... 9 * 1 = 9
// 2 * 2 = 4  2 * 2 = 4  4 * 2 = 8 ... 9 * 2 = 18
// ... ...
// 2 * 9 = 18  3 * 9 = 27  4 * 9 = 36 ... 9 * 9 = 81
public class ForTest6 {
    public static void main(String[] args) {
        for(int i =1; i<=9; i++){ // 행 (row) - 9행
            for (int k = 2; k<=9; k++){ // 열 - 8열
                System.out.print(k + "*"+ i + "=" + (k*i) + "\t");  // k = 2,3,4...9
            }
            System.out.println();
        }
    }
}
