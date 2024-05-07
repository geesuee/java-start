package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        for (int num = 2; num <= 20; num += 2) {
            System.out.println(num);
        }

        // 아래처럼 쓰는 코드가 좋은 건 아님, 이렇게도 할 수 있다는 내용
        // 반복 대상이 되는 변수, 조건식, 증감식만 들어가게 쓰는 코드가 더 가독성이 좋음
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
