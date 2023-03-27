import java.util.InputMismatchException;
import java.util.Scanner;

public class Scannertest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        while (true) {
            System.out.println("숫자를 입력해주세요 : ");
            try {
                age = sc.nextInt();
                sc.nextLine();

                if (age < 1) {
                    System.out.println("1 이상의 정수를 입력해주세요.");

                    continue;
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("제발 정수 숫자만 입력해주세요.");
                continue;
            }
            break;
        }
        System.out.println(age + "살");
    }
}
