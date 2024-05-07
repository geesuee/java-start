package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int[][] arr = new int[a][b];

        int i = 1;
        for (int row = 0; row < a; row++) {
            for (int col = 0; col < b; col++) {
                arr[row][col] = i++;
            }
        }

        for (int row = 0; row < a; row++) {
            for (int col = 0; col < b; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
