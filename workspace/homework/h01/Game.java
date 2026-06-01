package homework.h01;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("*** 멋쟁이 전사처럼 ***");
        System.out.println("캐릭터 이름을 지어주세요.");

        String name = s.next();
        int hp = 100; // hp가 0이되면 죽는것 ! = 나의 에너지
        int damage = 0; // damage = 나의 피해량
        int ultimateSkill = 1; // 필살기 기술 수량

        int enemyHp = 10; // 적군의 에너지
        int enemyDamage = 0; // 적군의 피해량



        System.out.println(name + "님 어서오세요. 게임을 시작합니다.");

        enemyHp = (int)(Math.random() * 90) +10; // 적군의 에너지는 10~99 까지의 랜덤

        //무한반복?
        while (true){
            System.out.println(enemyHp + "체력을 가진 적을 만났다. 어떤 행동을 하시겠습니까?");
            System.out.println("1) 싸운다 2) 도망간다 3) HP를 10회 회복한다  4) 필살기 사용");
            int action = s.nextInt();

            switch (action){
                case 1 -> {
                    System.out.println("적과 싸움니다");
                    enemyDamage = (int)(Math.random() * 11);
                    enemyHp -= enemyDamage;

                    // 랜덤으로 데미지 입히기
                    damage = (int)(Math.random() * 11);
                    hp -= damage;

                    System.out.println("적에게 " + enemyDamage + "만큼의 데미지를 주고" +
                            + damage + "의 데미지를 입었다.");
                    System.out.println("님의 체력은 " + hp + "입니다.");
                    System.out.println("적의 남은 체력은  " + enemyHp + "입니다.");

                }

                case 2 -> {

                    //최대 3까지
                    damage = (int)(Math.random() * 3);
                    hp -= damage;
                    enemyHp = (int)(Math.random() * 90) +10; // 적군의 에너지는 10~99 까지의 랜덤

                    System.out.println("도망갑니다. 대신 " + damage + "의 체력이 소비되었다.");
                    System.out.println("남은 체력은 " + hp + "입니다.");

                }
                case 3 ->{
                    hp +=10;
                    System.out.println("체력이 10 회복되었다.");
                    System.out.println("남은 체력은 " + hp + "입니다.");

                }

                case 4 ->{
                    enemyDamage = enemyHp;
                    enemyHp -= enemyDamage;
                    damage = 0;

                    ultimateSkill--;
                    System.out.println("궁극의 필살기를 사용했다.");
                    System.out.println("적에게 " + enemyDamage + "만큼의 데미지를 주고" +
                            + damage + "의 데미지를 입었다.");
                    System.out.println("님의 체력은 " + hp + "입니다.");
                    System.out.println("적의 남은 체력은  " + enemyHp + "입니다.");
                }
            }

            // 만약에 체력이 0이거나 적군의 에너지가 0이면 멈춰
            if (hp <=0 || enemyHp<=0){
                break;
            }


        }

        if( hp < 0 ){
            System.out.println("당신은 사망 했습니다.");
        } else if (enemyHp<=0) {
            System.out.println("전투에 승리했습니다. - Th end - ");
        }




    }
}
// 적절한FOR 문뭐 이런거 체려깅 0이되면 죽고 뭐 이런거 하기
