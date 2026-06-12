package ch09;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {3,6,7,8,5,3,5,6,8,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = {2,1,3};
        int[] arr4 = {1,2,3};

        // 1. arr 의 모든 요소를 출력하세요
        // 정답 : 3,6,7,8,5,3,5,6,8,2,3

        System.out.println("---- 1번 문제 ----");
        //        for (int i = 0; i<arr.length; i++){
        //            System.out.println(arr[i]);
        //        }

        System.out.println(Arrays.toString(arr)); // 배열을 문자열로 변화하는 메서드

        // 2. arr2와 arr3, arr2와 arr4의 모든 요소가 같은 값을 가지고 있는지 출력하세요.
        // (순서와 값이 모두 일치)
        // 정답 : arr2, arr3 다름
        // 정답 : arr2, arr4 다름

//  2. arr2와 arr3의 모든 요소가 같은 값을 가지고 있는지 비교
        System.out.println("---- 2번 문제 ----");
        System.out.println("arr2, arr3 " + Arrays.equals(arr2,arr3));
        System.out.println("arr2, arr4 " + Arrays.equals(arr2,arr4));


//        boolean isEqual = true;
//        if (arr2.length == arr3.length) {
//            for (int i = 0; i < arr2.length; i++) {
//                if (arr2[i] != arr3[i]) {
//                    isEqual = false;
//                    break;
//                }
//            }
//            System.out.println("arr2, arr3" + (isEqual ? "같음" : "다름"));
//        }
//
//
//
//    arr2와 arr4 비교
//        boolean isEqual2 = true;
//
//        if (arr2.length == arr4.length) {
//            for (int i = 0; i < arr2.length; i++) {
//                if (arr2[i] != arr4[i]) {
//                    isEqual2 = false;
//                    break;
//                }
//            System.out.println("arr2, arr4" + (isEqual2 ? "같음" : "다름"));

//        }
//




        // 3. arr 요소의 최소값과 최대값을 구하세요.
        // 정답 : 최소값 : 2  , 최대값 : 8

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { // 비교할 값이 최소값보다 작을 경우
                min = arr[i]; // 최소값을 교체한다.
            }
            if (arr[i] > max) { // 비교할 값이 최대값보다 클 경우
                max = arr[i]; // 최대값으로 교체한다.
            }
        }

        System.out.println("최소값 : " + min + ", 최대값 : " + max);

        Arrays.sort(arr);
        System.out.println("최소값 : " + arr[0]);
        System.out.println("최대값 : " + arr[arr.length-1]);




        // 4. arr 의 요소를 오름차순으로 정렬하세요.
        //  원래 배열 int[] arr = {3,6,7,8,5,3,5,6,8,2,3};

//        for (int i = 0; i< arr.length; i++){
//            for (int k =i; k<arr.length-1; k++){
//                if(arr[i]>arr[k+1]){
//                    // arr[i] <-> arr[k+1]
//                    int temp = arr[i];
//                   arr[i] = arr[k+1];
//                   arr[k+1]=temp;
//                }
//            }

            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

    }




    }

