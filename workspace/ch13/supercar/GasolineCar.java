package ch13.supercar;

// SuperCar을 상속받겠다
public class GasolineCar extends SuperCar {
    // 컴파일러에 의해서 기본 생성자가 만들어짐
//    GasolineCar(){super();}

    GasolineCar(int zero100){
        super(zero100);
    }

    @Override
    void move() {
        super.move();
        System.out.println("기름을 사용합니다.");
    }
}
