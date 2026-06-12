package ch09;

public class ArraryException {
    public static void main(String[] args) {
        // 1. NullPointerException

        String[] strArr = {"haru", "namu", "brong"};
        System.out.println(strArr[0]);

        int[] ageArr = null;
//        System.out.println(arrArr[0]);

        if (ageArr != null) {
            System.out.println(ageArr[0]);
        }


        //2. ArrayIndexOutBoundsException
//        if (ageArr.length){
//            System.out.println(strArr[3]);
//        }

//            System.out.println(strArr[3]);
//        System.out.println("main 실행 완료");
    }
    }
