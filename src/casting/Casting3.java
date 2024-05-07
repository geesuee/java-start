package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647;  // int 최고값
        long maxIntOver = 2147483648L;  // int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);  // 오버플로우 발생
        /*
        형변환을 통해 int 표현 범위를 넘는 값을 밀어넣을 경우, 전혀 다른 숫자가 표현됨 = 오버플로우
        보통 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것 처럼 처음부터 다시 시작 -> 얼마나 초과했는지에 따라 int 의 가장 작은 수에 더해짐
        오버플로우는 발생하지 않도록 막아야 함!
         */
    }
}
