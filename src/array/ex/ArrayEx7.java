package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sumArray = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");

            System.out.print("국어 점수:");
            int score1 = scanner.nextInt();

            System.out.print("영어 점수:");
            int score2 = scanner.nextInt();

            System.out.print("수학 점수:");
            int score3 = scanner.nextInt();

            int sum = score1 + score2 + score3;
            sumArray[i] = sum;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(i+1 + "번 학생의 총점 : " + sumArray[i] + ", 평균 : " + (double) sumArray[i]/3);
        }
    }
}
