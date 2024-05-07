package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue;  // 컴파일 오류 발생
        intValue = (int) doubleValue;  // 형변환
        System.out.println("intValue = " + intValue);

        /*
        큰 범위에서 작은 범위로 형변환을 할 때에는
        1. 소수점이 날아가거나
        2. 오버플로우가 될 수 있음
        때문에 자동으로 형변환이 되지 않고 명시적으로 형변환을 해주어야 함
         */
    }
}
