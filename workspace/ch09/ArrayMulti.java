package ch09;

public class ArrayMulti {
    public static void main(String[] args) {

        // 1. 다차원 배열 생성 (2행 3열)
        int[][] matrix = new int[2][3];
        matrix[0][1] = 10;
        matrix[1][2] = 20;

        // 2. 다차원 배열 생성 (초기화와 동시에)
        int[][] matrix2 ={
                {10,20,30},
                {40,50},
                {70,80,90}
        };


        // 3. 배열의 모든 요소 출력
//        System.out.println(matrix2[0][0]);
//        System.out.println(matrix2[0][1]);
//        System.out.println(matrix2[0][2]);
//
//
//        for (int i =0; i<3; i++){
//            System.out.println(matrix2[0][i]);
//        }
//        for (int i =0; i<3; i++){
//            System.out.println(matrix2[1][i]);
//        }
//

        for (int i = 0; i<matrix2.length; i++){
            for (int k =0; k<matrix2[i].length; k++){
                System.out.println("i : " + i+ "k : " +k);
                System.out.println(matrix2[i][k]);
            }
        }





    }
}
