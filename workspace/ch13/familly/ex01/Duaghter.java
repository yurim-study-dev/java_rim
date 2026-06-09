package ch13.familly.ex01;

public class Duaghter extends Parent {
//    String name;


// 생성자 : 클래스명과 동일한이름, 리턴타입은 없음
    Duaghter(String name){
        super(name);
    }

    void play(){
        System.out.println(name + " 코노에 간다.");
        doFaceMask();
    }

    // 마스크팩을 한다.
    void doFaceMask(){
        System.out.println(name + " 마스크 팩을 한다.");
    }

}
