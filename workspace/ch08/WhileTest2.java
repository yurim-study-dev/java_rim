package ch08;

// 첫 달에 1원을 받고 매달 두배씩 받을 때
// 몇달이 지나야 급여가 1억을 넘기는가?
public class WhileTest2 {
    public static void main(String[] args) {
        int month = 1; // 근무달
        int sel = 1; // 월급

        while(sel < 100000000){
            month ++;
            sel *= 2;

        }

        System.out.println(month + "달의 급여 : " + sel);



    }
}
