package ch12.car_study.car;

/**
 * Car 클래스 테스트 클래스
 * 자동차의 기능을 테스트합니다.
 */
public class CarTest {
    void main() {
        // ========== Car 객체 생성 ==========
        // "람보르기니" 모델의 자동차 객체를 생성합니다.
        // Car 생성자가 호출되고 model이 "람보르기니"로 초기화됩니다.
        Car mycar = new Car("람보르기니");

        // 초기 속도를 100으로 설정합니다.
        // (보통은 0에서 시작하지만, 테스트를 위해 임의로 설정)
        mycar.speed = 100;

        // ========== 출발 및 주행 ==========
        // 자동차를 출발시킵니다.
        // - 기어가 0에서 1로 올라감
        // - 속도가 100에서 110으로 증가
        mycar.start();

        // 추가로 가속합니다. (속도가 10씩 증가)
        mycar.speedUp();   // 110 → 120
        mycar.speedUp();   // 120 → 130
        mycar.speedUp();   // 130 → 140

        // 기어를 올립니다. (1단 → 2단)
        mycar.gearUp();    // gear = 2

        // 더 가속합니다.
        mycar.speedUp();   // 140 → 150
        mycar.speedUp();   // 150 → 160

        // 기어를 올립니다. (2단 → 3단)
        mycar.gearUp();    // gear = 3

        // 계속 가속합니다.
        mycar.speedUp();   // 160 → 170
        mycar.speedUp();   // 170 → 180
        mycar.speedUp();   // 180 → 190

        // 기어를 올립니다. (3단 → 4단)
        mycar.gearUp();    // gear = 4

        // 마지막 가속
        mycar.speedUp();   // 190 → 200
        mycar.speedUp();   // 200 → 210

        // ========== 정지 ==========
        // 자동차를 정지시킵니다.
        // - 기어가 4에서 0으로 설정됨
        // - 속도가 210에서 0까지 10씩 감속 (감속 21회)
        mycar.stop();
    }
}