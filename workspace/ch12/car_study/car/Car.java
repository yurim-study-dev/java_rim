package ch12.car_study.car;

/**
 * 자동차(Car) 부모 클래스
 * 자동차의 기본 기능을 정의합니다.
 * Bus 클래스가 이 클래스를 상속받아 버스의 추가 기능을 구현합니다.
 */
public class Car {
    // ========== 필드(멤버 변수) ==========
    String model;      // 자동차 모델명 (예: "람보르기니")
    int speed;         // 현재 속도 (0으로 자동 초기화됨)
    int gear;          // 현재 기어 (0으로 자동 초기화됨)

    // ========== 생성자 ==========
    /**
     * Car 클래스의 생성자
     * 자동차 모델명을 받아서 초기화합니다.
     * @param model 자동차 모델명 (예: "람보르기니")
     */
    Car(String model) {
        System.out.println("Car(String name) 생성자 호출됨.");
        this.model = model; // this는 자기 자신 인스턴스를 가리킴 (자신의 model 필드에 대입)
    }

    // ========== 속도 관련 메서드 ==========
    /**
     * 자동차를 10km/h 가속시킵니다.
     */
    void speedUp() {
        speed += 10;  // 현재 속도에 10을 더함
        System.out.println("가속합니다. 현재 속도는 " + speed + "Km/h 입니다.");
    }

    /**
     * 자동차를 10km/h 감속시킵니다.
     */
    void speedDown() {
        speed -= 10;  // 현재 속도에 10을 뺌
        System.out.println("감속합니다. 현재 속도는 " + speed + "Km/h 입니다.");
    }

    // ========== 기어 관련 메서드 ==========
    /**
     * 기어를 1단 올립니다.
     */
    void gearUp() {
        gear++;  // 기어를 1 증가
        System.out.println("기어를 1단 올려서 " + gear + "단이 되었습니다.");
    }

    /**
     * 기어를 1단 내립니다.
     */
    void gearDown() {
        gear--;  // 기어를 1 감소
        System.out.println("기어를 1단 내려서 " + gear + "단이 되었습니다.");
    }

    // ========== 운행 관련 메서드 ==========
    /**
     * 자동차를 출발시킵니다.
     * 기어를 올리고 가속합니다.
     */
    void start() {
        System.out.println(model + ": 출발합니다.");
        gearUp();   // 기어를 1단으로 올림
        speedUp();  // 속도를 10km/h 증가
    }

    /**
     * 자동차를 정지시킵니다.
     * 기어를 0으로 설정하고 속도가 0이 될 때까지 감속합니다.
     */
    void stop() {
        System.out.println("멈춥니다.");
        gear = 0;  // 기어를 0으로 설정

        // 속도가 0이 될 때까지 계속 감속
        while (speed > 0) {
            speedDown();  // 10km/h씩 감속
        }
    }
}