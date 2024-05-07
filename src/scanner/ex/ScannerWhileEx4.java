package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int finalPrice = 0;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int input = scanner.nextInt();

            if (input == 1) {
                // 상품명
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();
                scanner.nextLine();
                // 가격
                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();
                // 수량
                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();
                int totalPrice = price * quantity;
                finalPrice += totalPrice;

                System.out.println("상품명: " + product + " 가격: " + price + " 수량: " + quantity + " 합계: " + totalPrice);

            } else if (input == 2) {
                System.out.println("총 비용: " + finalPrice);
                finalPrice = 0;  // 결제 후 비용 초기화

            } else if (input == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

    }
}
