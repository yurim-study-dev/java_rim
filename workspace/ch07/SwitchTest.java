package ch07;

public class SwitchTest {
    public static void main(String[] args) {
        int month = 5;

        if (month < 1 || month > 12) {
            System.out.println("1~12사이의 숫자를 입력해야 합니다.");
            System.exit(0);
        }
        switch (month) {
            case 1:
                System.out.println("1월의 마지막 날은 31일 입니다.");
                break;
            case 2:
                System.out.println("2월의 마지막 날은 28일 입니다.");
                break;
            case 3:
                System.out.println("3월의 마지막 날은 31일 입니다.");
                break;
            case 4:
                System.out.println("4월의 마지막 날은 30일 입니다.");
                break;
            case 5:
                System.out.println("5월의 마지막 날은 31일 입니다.");
                break;
            case 6:
                System.out.println("6월의 마지막 날은 30일 입니다.");
                break;
            case 7:
                System.out.println("7월의 마지막 날은 31일 입니다.");
                break;
            case 8:
                System.out.println("8월의 마지막 날은 31일 입니다.");
                break;
            case 9:
                System.out.println("9월의 마지막 날은 30일 입니다.");
                break;
            case 10:
                System.out.println("10월의 마지막 날은 31일 입니다.");
                break;
            case 11:
                System.out.println("11월의 마지막 날은 30일 입니다.");
                break;
            case 12:
                System.out.println("12월의 마지막 날은 31일 입니다.");
                break;
        }
    }
}



