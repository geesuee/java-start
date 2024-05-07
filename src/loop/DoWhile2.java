package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        // do-while 문은 조건과 관계 없이 최초 한 번은 항상 실행
        // 조건이 참이면 한 번 더 실행, 아니면 최초 한 번만 실행
        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);
    }
}
