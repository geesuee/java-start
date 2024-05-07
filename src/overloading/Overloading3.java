package overloading;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    // 첫 번째 add 메서드 : 두 정수를 받아서 합을 반환
    // 첫 번째 메서드를 주석 처리해서 없애도, int 값은 double 로 자동 형변환 가능하기 때문에 에러 발생하지 않음
//    public static int add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }

    // 두 번째 add 메서드 : 두 실수를 받아서 합을 반환
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
