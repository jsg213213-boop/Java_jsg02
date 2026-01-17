package PR_260117_260118;
import java.util.Scanner;

public class _15_PR {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("숫자를 입력하세요: ");

            int number = scanner.nextInt();

            System.out.println("입력하신 숫자는 " + number + "입니다.");

        } catch (Exception e) {

            System.out.println("[오류] 숫자가 아닌 문자가 입력되었습니다.");
            System.out.println("오류 메시지: " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }

}
