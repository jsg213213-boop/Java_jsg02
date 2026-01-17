package PR_260117_260118;
import java.util.Scanner;
public class _06_PR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이 입력: ");
        int age = scanner.nextInt();

        boolean isAdult = age >= 19;
        System.out.println("성인입니까? " + isAdult);

        System.out.println("-------------------------");


        System.out.print("점수 입력: ");
        int score = scanner.nextInt();

        String result = (score >= 60) ? "합격" : "불합격";
        System.out.println(result + " 입니다.");


        scanner.close();
    }

}
