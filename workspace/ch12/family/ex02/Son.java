package ch12.family.ex02;

//son이 parent의 필드와 메서드를 상속 받는다.
public class Son extends Parent {
    Son(String name){
        super(name); // super() 부모의 생성자 호출
    }
    void play(){
        System.out.println(name + " 게임을 한다.");
    }

    void work(){
        System.out.println(name + " 일한다.");
    }
}
