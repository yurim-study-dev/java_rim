package ch12.family.ex01;

public class Test {
    public static void main(String[] args) {
//        Parent p = new Parent("부모");
//        Son p = new Son("아들");

        Daughter p = new Daughter("딸");


        dailySchedule(p);
    }

    // 하루일과
    //Parent 타입의 매개변수정의
    private static void dailySchedule(Parent p){    //Parent 타입의 매개변수정의
        p.eat();
        p.play();
        p.sleep();

    }

    private static void dailySchedule(Daughter p){    //Parent 타입의 매개변수정의
        p.eat();
        p.play();
        p.sleep();
    }

    private static void dailySchedule(Son p){    //Parent 타입의 매개변수정의
        p.eat();
        p.play();
        p.sleep();
    }
}
