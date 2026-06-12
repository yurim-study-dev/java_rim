package ch12.car_study.car;

/**
 * Bus 클래스 테스트 클래스
 * 버스의 기능을 테스트합니다.
 * (부모 클래스 Car의 기능 + 버스만의 기능)
 */
public class BusTest {
    void main() {
        // ========== Bus 객체 생성 ==========
        /**
         * Bus 생성자 호출
         *
         * 생성자 호출 순서:
         * 1. Bus 생성자 실행
         * 2. super("람보르기니") → Car 생성자 호출
         *    - Car의 필드 초기화 (model="람보르기니", speed=0, gear=0)
         * 3. Bus의 필드 초기화
         *    - no="10-2", type="마을 버스", stations=배열, price=1300, maxPassenger=15
         *    - passengerCount=0, station=0 (자동 초기화)
         */
        Bus mycar = new Bus(
                "람보르기니",                                          // model (Car에서 상속)
                "10-2",                                              // 버스 번호
                "마을 버스",                                          // 버스 종류
                new String[]{"우리집", "김포고등학교", "김포 시청"}, // 노선 (정거장 3개)
                1300,                                                // 요금
                15                                                   // 최대 승객수
        );

        // ========== 첫 번째 주행 (우리집 → 김포고등학교) ==========
        // Car의 start() 메서드 호출 (상속받음)
        // - 기어 1단 올림 (0 → 1)
        // - 속도 10 증가 (0 → 10)
        mycar.start();

        // 추가 가속 (Car의 speedUp() 메서드)
        mycar.speedUp();  // 10 → 20
        mycar.speedUp();  // 20 → 30
        mycar.speedUp();  // 30 → 40
        mycar.speedUp();  // 40 → 50
        mycar.speedUp();  // 50 → 60

        // ========== 정거장 도착 및 승객 탑승 ==========
        // Bus의 오버라이딩된 stop() 메서드 호출
        // - super.stop() 실행: 기어=0, 속도=0까지 감속
        // - station 증가: station = 0 → 1 (첫 번째 정거장 "우리집" → 두 번째 정거장 "김포고등학교")
        // - 현재 정거장 정보 출력
        mycar.stop();

        // 승객 탑승 (Bus의 ride() 메서드)
        // passengerCount < maxPassenger (0 < 15)이므로 탑승 가능
        mycar.ride();  // passengerCount: 0 → 1
        mycar.ride();  // passengerCount: 1 → 2
        mycar.ride();  // passengerCount: 2 → 3

        // ========== 두 번째 주행 (김포고등학교 → 김포 시청) ==========
        // 다시 출발
        mycar.start();

        // ========== 버스 정보 출력 ==========
        /**
         * getBusInfo() 메서드로 버스의 현재 상태를 출력합니다.
         *
         * 출력 내용:
         * - 버스 번호: 10-2
         * - 종류: 마을 버스
         * - 현재 위치: stations[1] = "김포고등학교"
         * - 남은 좌석: 15 - 3 = 12
         * - 요금: 1300
         */
        System.out.println(mycar.getBusInfo());
    }
}