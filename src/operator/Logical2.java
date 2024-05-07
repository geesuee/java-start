package operator;

public class Logical2 {

    public static void main(String[] args) {
        int a = 15;
        // a 는 10 보다 크고 20 보다 작다
        boolean result = 10 < a && a < 20;  // 보다 가독성이 높도록 변수 위치 조정
        System.out.println("result = " + result);
    }
}
