package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            /*
            scanner.nextLine(); 은 라인을 통으로 입력으로 가져오는데
            scanner.nextInt(); 는 숫자만 가져옴

            - int age = scanner.nextInt(); 에서
            - 10\n 입력하면
            - 10만 가져가고, \n은 입력값에 남아있음
            - while 문이 다시 돌아서 String name = scanner.nextLine(); 에 왔을 때
            - 입력값이 남은 \n 로 인식됨
            -> name 값 입력 받지 않고 age 로 넘어감
            -> 사이에 scanner.nextLine(); 를 넣어 할 줄 띄어주어야 함
             */

            System.out.println("입력한 이름 : " + name + " , 나이 : " + age);
        }
    }
}
