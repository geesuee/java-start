package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }

    /*
    연산자 우선순위

    다 외울 필요 없고 상식적으로 생각
    애매하면 괄호 써서 우선순위 지정하자 -> 가독성을 높이자

    괄호가 제일 높고, 대입 연산자가 제일 낮다

    1. 괄호
    2. 단항 연산자 (++, --, !, ~, new, (type))
    3. 산술 연산자 (*, /, %, +, -)
    4. Shift 연산자 (<<, >>, >>>)
    5. 비교 연산자 (<, <=, >, >=, instanceof)
    6. 등식 연산자 (==, !=)
    7. 비트 연산자 (&, ^, |)
    8. 논리 연산자 (&&, ||)
    9. 삼항 연산자 (? : )
    10. 대입 연산자 (=, +=, -=, *=, /=, %=)
     */
}
