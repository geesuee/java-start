package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i < 2; i++) {  // i 는 for 문 내에서만 생존
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        }  // i 생존 종료

//        System.out.println("main i = " + i);
        System.out.println("main m = " + m);
    }
}
