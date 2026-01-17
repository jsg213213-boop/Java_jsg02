package PR_260117_260118;

public class _14_PR {
    public static void main(String[] args) throws Exception {


        try {
            System.out.println("실행 1: 실패예시");
        } catch (ArithmeticException e) {

            System.out.println("결과: 0으로 나눌 수 없습니다. (ArithmeticException 처리)");
        }

        System.out.println("----------");

        generateCustomException();
    }

    public static void generateCustomException() throws Exception {

        throw new Exception("직접 예외 발생!");
    }

}
