package homework.h01;

import java.util.Scanner;

// 선생님 코드

public class Game1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("***멋쟁이 전사처럼***");
        System.out.println("캐릭터 이름을 지어주세요.");
        String name = s.next();
        int hp = 50; // 내 에너지
        int damage = 0; // 내 피해량
        int ultimateSkill = 1; // 필살기 기술 수량
        int enemyHp = 0; // 적군 에너지
        int enemyDamage = 0; // 적군 피해량

        // ===== 새로운 추가 기능 1: 게임 단계 시스템 =====
        // 게임 진행 단계를 관리하는 변수 (1단계, 2단계)
        int stage = 1; // 현재 게임 단계

        // ===== 새로운 추가 기능 3: 회복 횟수 제한 =====
        // 체력 회복을 총 3번만 사용 가능하도록 제한
        int healCount = 3; // 남은 회복 횟수

        System.out.println(name + "님 어서오세요. 게임을 시작합니다.");

        // ===== 새로운 추가 기능 1: 단계별 적 설정 =====
        if (stage == 1) {
            enemyHp = (int)(Math.random() * 90) + 10; // 1단계: 10 ~ 99
        } else {
            enemyHp = (int)(Math.random() * 100) + 30; // 2단계: 30 ~ 129 (더 강함)
        }

        while(true){
            System.out.println(enemyHp + " 체력을 가진 적을 만났다. 어떤 행동을 하시겠습니까?");
            System.out.println("1) 싸운다 2) 도망간다 3) HP를 10 회복한다 4) 필살기 사용");
            int action = s.nextInt();

            switch(action){
                case 1 -> {
                    System.out.println("적과 싸웁니다.");
                    enemyDamage  = (int)(Math.random() * 11);
                    enemyHp -= enemyDamage;
                    damage = (int)(Math.random() * 11);
                    hp -= damage;
                    System.out.println("적에게 " + enemyDamage + "의 데미지를 주고 " + damage + "의 데미지를 입었다.");
                    System.out.println("나의 남은 체력은 " + hp + "입니다.");
                    System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");
                }
                case 2 -> {
                    // ===== 새로운 추가 기능 1-1: 확률적으로 도망치기 =====
                    // 도망칠 확률을 50%로 설정 (0 또는 1 중 랜덤)
                    int escapeChance = (int)(Math.random() * 2); // 0 또는 1

                    if (escapeChance == 1) {
                        // 도망 성공! (확률 50%)
                        System.out.println("성공적으로 도망쳤다!");
                        enemyHp = (int)(Math.random() * 90) + 10; // 새로운 적 등장

                        // 단계별 적 강화 (2단계면 더 강한 적)
                        if (stage == 2) {
                            enemyHp = (int)(Math.random() * 100) + 30; // 2단계 적
                        }
                    } else {
                        // 도망 실패! (확률 50%)
                        System.out.println("도망 실패! 적의 공격을 받는다!");
                        damage = (int)(Math.random() * 3);
                        hp -= damage;
                        System.out.println(damage + "의 체력이 소비되었다.");
                    }
                    System.out.println("남은 체력은 " + hp + "입니다.");
                }
                case 3 -> {
                    // ===== 새로운 추가 기능 3-1: 회복 횟수 제한 =====
                    // 회복을 총 3번만 사용 가능하도록 제한
                    if (healCount > 0) {
                        hp += 10;
                        healCount--; // 회복 횟수 감소
                        System.out.println("체력이 10 회복 되었다.");
                        System.out.println("남은 체력은 " + hp + "입니다.");
                        System.out.println("남은 회복 횟수: " + healCount + "회");
                    } else {
                        // 회복 횟수를 모두 사용했을 때
                        System.out.println("더 이상 사용할 수 있는 회복이 없습니다!");
                        System.out.println("남은 체력은 " + hp + "입니다.");
                    }
                }
                case 4 -> {
                    if(ultimateSkill > 0){
                        int chance = (int)(Math.random() * 2);
                        enemyDamage = enemyHp * chance;
                        enemyHp -= enemyDamage;
                        damage = 0;
                        ultimateSkill--;
                        System.out.println("궁극의 필살기를 사용했다.");
                        System.out.println("적에게 " + enemyDamage + "의 데미지를 주고 " + damage + "의 데미지를 입었다.");
                        System.out.println("나의 남은 체력은 " + hp + "입니다.");
                        System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");
                    }else{
                        System.out.println("사용할 수 있는 필살기가 없습니다.");
                    }
                }
            }

            // ===== 새로운 추가 기능 2: 1단계 적 처치 후 2단계로 진행 =====
            // 플레이어가 죽으면 게임 종료 (break)
            if(hp <= 0){
                break;
            }

            // 적을 처치했을 때 단계 확인
            if(enemyHp <= 0){
                // 1단계 적을 처치했을 때
                if (stage == 1) {
                    System.out.println("\n========== 1단계 승리! ==========");
                    System.out.println("더 강한 2단계 적이 나타났다!");
                    stage = 2; // 2단계로 진행
                    enemyHp = (int)(Math.random() * 100) + 30; // 2단계 적 소환 (30 ~ 129)
                    healCount = 2; // 2단계에서 회복 2회 추가 지급
                    System.out.println("회복 횟수가 2회 추가되었습니다!");
                    System.out.println("=============================\n");
                } else {
                    // 2단계 적을 처치했을 때 게임 완전 종료
                    break;
                }
            }
        }

        // ===== 게임 결과 판정 =====
        if(hp <= 0){
            System.out.println("\n당신은 사망했습니다. - The end -");
        }else if(enemyHp <= 0 && stage == 2){
            System.out.println("\n========== 게임 완전 승리! ==========");
            System.out.println("모든 단계를 클리어했습니다!");
            System.out.println("남은 체력: " + hp);
            System.out.println("축하합니다! - The end -");
            System.out.println("============================");
        }
    }
}
