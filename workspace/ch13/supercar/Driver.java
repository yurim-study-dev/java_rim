package ch13.supercar;

public class Driver {
    // 기본 생성자
//    Driver(){}

    void drive(SuperCar car){
        car.move();

        if (car instanceof Chargeable){
            ((Chargeable)car).charge();
        }
    }
}
