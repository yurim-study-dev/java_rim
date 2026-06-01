package ch08;

public class ForTest5 {
    public static void main(String[] args) {
//        star1();
        // star1이라는 매서드를 호출하라
        star2();
        star3();
        star4();

    }

    // *
    // **
    // ***
    // ****
    // *****

    // 메서드
    static void star1(){
        for (int i = 0; i<1; i++){
            System.out.print("*");
        } // 별 1개
        System.out.println(); // 줄바꿈

        for (int i = 0; i<2; i++){
            System.out.print("*");
        } // 별 2개
        System.out.println(); // 줄바꿈

        for (int i = 0; i<3; i++){
            System.out.print("*");
        } // 별 3개
        System.out.println();

        for (int i = 0; i<4; i++){
            System.out.print("*");
        } // 별 4개


    }

    static void star2(){
        // 중첩 for문
        for (int i = 0; i<5; i++){
            for (int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // *****
    // ****
    // ***
    // **
    // *

    static void star3(){
        // 중첩 for문
        for (int i = 0; i < 5; i++){
            for (int k = 0; k < 5-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    *  -> i 가 0일때 스페이스 4개
    //   **
    //  ***
    // ****
    //*****
    static void star4(){

        for (int i = 0; i<5; i++){
            // 스페이스 출력하는 부분
            // 줄이니까 4-i
            for (int k = 0; k < 4-i; k++){
                System.out.print(" ");
            }
            // 별을 출력하는 부분
            for (int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
