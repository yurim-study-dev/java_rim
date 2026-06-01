package ch09;

public class ArrayBasic {
    public static void main(String[] args) {
        // scores int 배열을 선언하고 생성하세요. (크기는 3)
        int[] scores = new int[3];

        // names String 배열을 선언하고 생성하세요.(크기는 3)
        String[] names = new String[5];

        // scores 배열의 각 요소에 값을 할당
        scores[0] = 0;
        scores[1] = 1;
        scores[2] = 2;

        // names 배열의 각 요소에 값을 할당

        names[0] = "나무";
        names[1] = "몽이";
        names[2] = "요미";
        names[3] = "김코딱지";
        names[4] = "누렁이";




        // scores 배열의 두번쨰 요소값을 출력
        System.out.println(scores[1]);

        // names 배열의 모든 요소값을 출력

        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }


    }
}
