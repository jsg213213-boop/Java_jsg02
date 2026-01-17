package PR_260117_260118;
import java.util.Scanner;

public class _05_PR {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("정수 1 : ");

            int a = scanner.nextInt();

            System.out.println("정수 2 : ");

            int b = scanner.nextInt();
            System.out.println("===============================");
            System.out.println("몫(/) : " + (a/b));
            System.out.println("나머지(%) : " + (a%b));
            System.out.println("===============================");



        }

    }
