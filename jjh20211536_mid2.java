package jjh20211536_mid2;

import java.util.Random;
import java.util.Scanner;

public class jjh20211536_mid2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"가위", "바위", "보"};

        System.out.println("가위바위보 게임을 시작합니다.");
        System.out.println("가위, 바위, 보 중에서 두 개를 선택하세요.");

        System.out.print("첫 번째 선택은? ");
        String myHand1 = scanner.nextLine();
        System.out.print("두 번째 선택은? ");
        String myHand2 = scanner.nextLine();

        int comHand1 = random.nextInt(3);
        int comHand2 = random.nextInt(3);
        String comChoice1 = options[comHand1];
        String comChoice2 = options[comHand2];
        System.out.println("컴퓨터의 첫 번째 선택: " + comChoice1);
        System.out.println("컴퓨터의 두 번째 선택: " + comChoice2);

        System.out.println("한 번에 하나의 선택을 입력하세요.");
        System.out.print("당신의 선택은? ");
        String myHand3 = scanner.nextLine();

        int comFinalIndex = random.nextInt(2);
        String comHand3;
        if (comFinalIndex == 0)
            comHand3 = comChoice1;
        else
            comHand3 = comChoice2;
        System.out.println("컴퓨터의 최종 선택: " + comHand3);

        if (myHand3.equals(comHand3)) {
            System.out.println("비겼습니다!");
        } else if ((myHand3.equals("가위") && comHand3.equals("보")) ||
                   (myHand3.equals("바위") && comHand3.equals("가위")) ||
                   (myHand3.equals("보") && comHand3.equals("바위"))) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }

        scanner.close();
    }
}
