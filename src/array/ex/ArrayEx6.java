package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();
        int[] inputArray = new int[count];

        int min = 0;
        int max = 0;
        System.out.println(count + "개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            // 입력 받기
            int input = scanner.nextInt();
            // 초기화
            if (i == 0) {
                min = input;
                max = input;
            }
            // 배열 저장
            inputArray[i] = input;

            if (input < min) {
                min = input;
            }
            if (input > max) {
                max = input;
            }
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
