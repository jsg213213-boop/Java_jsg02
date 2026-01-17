package PR_260117_260118;
import java.util.Scanner;

public class _07_PR {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("현재 온도를 입력하세요: ");
        int temp = scanner.nextInt();


        if (temp > 30) {
            System.out.println("더움");
        } else if (temp >= 22) {
            System.out.println("적당함");
        } else {
            System.out.println("조금 쌀쌀함");
        }


        System.out.println("----------------");


        System.out.println("봄");

        scanner.close();
    }

}
