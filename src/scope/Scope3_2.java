package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;

        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);

        /*
        temp 는 if 코드 블록 안에서만 사용하는 변수
        이를 main 블록 안에 선언 해놓은 상태
        1. 비효율적인 메모리 사용
            - main() 코드 블록이 종료될 때 까지 메모리야 유지
            - 불필요한 메모리 낭비
            - if 코드 블록 안에 temp 를 선언했다면, if 코드 블록 종료 시점에 해당 변수의 메모리 제거
        2. 코드 복잡성 증가
            - if 문 안에서만 사용하는 변수를 밖에 꺼내놔서 이후에도 계속 접근 가능하도록 만들어 둠
            - 유지보수 시에 m은 물론이고 temp 까지 신경써야함
         */
    }
}
