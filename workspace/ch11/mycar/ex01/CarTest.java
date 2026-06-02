package ch11.mycar.ex01;

public class CarTest {
    void main(){
        // car 인스턴스 생성
        // 인스턴스를 생성 할 때 사용한 클래스가 생성한 인스턴스의 타입이 된다.

        Car mycar = new Car();
        mycar.model = "부가티";

        mycar.start();
        mycar.sppedUp();
        mycar.sppedUp();
        mycar.sppedUp();
        mycar.sppedUp();

        mycar.gearUp();
        mycar.sppedUp();
        mycar.sppedUp();

        mycar.gearUp();
        mycar.sppedUp();
        mycar.sppedUp();

        mycar.gearUp();
        mycar.sppedUp();
        mycar.sppedUp();

        mycar.stop();






    }
}
