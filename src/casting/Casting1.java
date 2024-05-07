package casting;

public class Casting1 {

    public static void main(String[] args) {
        // int < long < double
        // 작은 범위에서 큰 범위로의 형변환은 문제 없음
        // => 자동 형변환(묵시적 형변환)

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
