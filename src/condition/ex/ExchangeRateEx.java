package condition.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 10;
        int won;
        String message;

        if (dollar < 0) {
            message = "잘못된 금액입니다.";
        } else if (dollar == 0) {
            message = "환전할 금액이 없습니다.";
        } else {
            won = dollar * 1300;
            message = "환전 금액은 " + won + "원 입니다.";
        }

        System.out.println("dollar = " + dollar);
        System.out.println("message = " + message);
    }
}
