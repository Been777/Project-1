import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        return;
                    }
                    break;
                default:
                    System.out.println("올바른 선택이 아닙니다.");
                    break;
            }

            System.out.println("결과 : " + result);


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료"); // Y/N 기능 추가하면 좋을듯
        } while (!scanner.next().equals("exit"));
    }
}
