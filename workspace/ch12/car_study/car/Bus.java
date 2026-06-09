package ch12.car_study.car;

/**
 * 버스(Bus) 자식 클래스
 * Car 클래스를 상속받아 버스만의 기능을 추가합니다.
 *
 * 상속 관계:
 *   Car (부모 클래스)
 *    ↑
 *    └─ Bus (자식 클래스) extends Car
 *
 * Bus는 Car의 모든 필드(model, speed, gear)와 메서드를 물려받습니다.
 * 추가로 버스만의 필드(승객 수, 노선, 요금 등)와 메서드를 가집니다.
 */
public class Bus extends Car {
    // ========== 버스만의 필드(멤버 변수) ==========
    private int passengerCount;    // 현재 탑승한 승객 수 (0으로 초기화)
    private String no;             // 버스 번호 (예: "10-2")
    private String type;           // 버스 종류 (예: "마을버스", "광역버스")
    private String[] stations;     // 버스 노선 (정거장 목록 배열)
    private int station;           // 현재 정거장 위치 (배열 인덱스, 0으로 초기화)
    private int price;             // 탑승 요금 (예: 1300원)
    private int maxPassenger;      // 최대 승객 수 (정원)

    // ========== 생성자 ==========
    /**
     * Bus 클래스의 생성자
     *
     * super(model): 부모 클래스 Car의 생성자를 호출합니다.
     *   - 부모 클래스의 필드(model, speed, gear)를 초기화합니다.
     *   - 생성자 호출 순서: super() 먼저 실행 → 자신의 코드 실행
     *
     * @param model 자동차 모델명 (Car에서 상속받음)
     * @param no 버스 번호
     * @param type 버스 종류
     * @param stations 버스 노선 (정거장 배열)
     * @param price 탑승 요금
     * @param maxPassenger 최대 승객수
     */
    public Bus(String model, String no, String type,
               String[] stations, int price, int maxPassenger) {
        // ⭐ super(model): 부모 클래스 Car의 생성자 호출
        // 부모의 model 필드가 "람보르기니"로 초기화됨
        super(model);

        // 자신의 필드들을 초기화 (버스만의 정보)
        this.no = no;
        this.type = type;
        this.stations = stations;
        this.price = price;
        this.maxPassenger = maxPassenger;
    }

    // ========== 승객 관리 메서드 ==========
    /**
     * 버스에 승객 1명을 태웁니다.
     * 정원 초과 확인 후 탑승 가능 여부를 판단합니다.
     */
    void ride() {
        // 현재 승객 수 < 최대 승객 수일 때만 탑승 가능
        if (passengerCount < maxPassenger) {
            passengerCount++;  // 승객 1명 증가
            System.out.println("1명이 승차합니다.");
        } else {
            // 정원 초과 시 탑승 불가
            System.out.println("승차 인원이 초과되었습니다. 다음 버스를 타세요.");
        }
    }

    /**
     * 버스에서 승객 1명을 내립니다.
     */
    void leave() {
        passengerCount--;  // 승객 1명 감소
        System.out.println("1명이 하차합니다.");
    }

    // ========== 메서드 오버라이딩 ==========
    /**
     * 부모 클래스 Car의 stop() 메서드를 재정의합니다.
     *
     * 메서드 오버라이딩이란?
     *   - 부모 클래스에서 정의한 메서드를 자식 클래스에서 다시 구현하는 것
     *   - 자식 클래스만의 특수한 동작을 추가할 수 있습니다.
     *
     * super.stop(): 부모 클래스의 stop() 메서드를 명시적으로 호출
     *   - 부모의 기능(속도를 0까지 감속, 기어를 0으로 설정)을 먼저 실행
     *   - 그 후 자식의 추가 기능(다음 정거장으로 이동)을 실행
     */
    void stop() {
        // ⭐ super.stop(): 부모 Car의 stop() 메서드 호출
        // 부모에서: 기어=0, 속도=0까지 감속
        super.stop();

        // 버스만의 추가 동작: 다음 정거장으로 이동
        station++;  // 현재 정거장 인덱스를 1 증가

        // 마지막 정거장에 도착했으면 처음으로 돌아감 (순환 노선)
        if (station == stations.length) {
            station = 0;  // 처음 정거장(인덱스 0)으로 설정
        }

        // 현재 정거장 정보 출력
        System.out.println("이번역은 " + stations[station] + "역 입니다. This stop is xxx.");
    }

    // ========== 정보 조회 메서드 ==========
    /**
     * 현재 정거장까지 남은 거리를 반환합니다. (미완성 메서드)
     * @return 남은 정거장 수
     */
    int getStationsLeft() {
        int result = 0;  // 아직 구현되지 않음
        return result;
    }

    /**
     * 버스의 현재 상태 정보를 문자열로 반환합니다.
     * @return 버스 번호, 종류, 현재 위치, 남은 좌석, 요금 정보
     */
    String getBusInfo() {
        return "버스 번호: " + no
                + ", 종류: " + type
                + ", 현재 위치: " + stations[station]
                + ", 남은 좌석: " + (maxPassenger - passengerCount)
                + ", 요금: " + price;
    }
}