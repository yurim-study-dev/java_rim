package ch10;

// 세 과목의 총점과 평균을 계산하는 메서드를 작성하고 이를 출력하는 프로그램을 작성하세오.
public class MethodSolve {

    // int[] 점수를 전달받아서 총점을 전달받아서 총점을 계산해서 반환하는 매서드(sum)
    int sum(int[] scores){
        int total = 0;

        for(int score : scores){
            total += score;
        }

        return total;
    }


    // int [] 점수 배열을 전달받아서 평균을 계산해서 변환하는 매서드(avg)
    // 평균은 소수도 표현해야 함

    double avg(int[] scores){
       int total = sum(scores);
        double scoreAvg = (double)total / scores.length;
        return Math.round(scoreAvg*10)/10.0;
    }




    // int[] 점수를 전달받아서 총점과 평균을 전달 받아서 출력하는 매서드(printScore)
    // 출력 예시 :
    // 총점 : 268, 평균 : 89.4

    void printScore(int[] scores){
        int total = sum(scores);
        double scoreAvg = avg(scores);
        System.out.println("총점 : " + total + " , 평균 : " + scoreAvg);
    }



    void main(){



        // haru는 국어, 영어, 수학 점수가 각각 80,70,56이다.
        // namu는 국어, 영어, 수학 점수가 각각 90,77,80이다.
        // brong이는 국어, 영어, 수학 점수가 각각 100,99,88이다.


        // 이 셋의 총점과 평균을 구해서 출력하세요.

        int[] haruScore ={80, 70 , 56};
        int[] namuScore = {90, 77, 80};
        int[] brongScore = {100, 99, 88};

        printScore(haruScore);
        printScore(namuScore);
        printScore(brongScore);

    }
}
