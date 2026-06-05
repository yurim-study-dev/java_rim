package ch12.car;

public class BusTest {
    void main(){
        Bus mycar = new Bus("람보르기니", "10-2", "마을 버스"
                , new String[]{"우리집", "김포고등학교", "김포 시청"}
                , 1300, 15);
        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        mycar.ride();
        mycar.ride();
        mycar.ride();


        mycar.start();

        System.out.println(mycar.getBusInfo());
    }
}