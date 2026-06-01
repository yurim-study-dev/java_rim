package ch08;
// 첫 달에 1원을 받고 매달 두배씩 받을 때
// 3년째 되는 달에는 얼마를 받는가?

public class ForTest2 {
    public static void main(String[] args) {
        long sel = 1; // 월급

        for (int month = 1; month < 36; month++) {
            sel *= 2;
        }

        System.out.println("3년째의 급여 : " + sel);
    }
}
