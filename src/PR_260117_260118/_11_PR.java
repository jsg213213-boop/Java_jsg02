package PR_260117_260118;

public class _11_PR {
    public static void main(String[] args) {

        System.out.println("--- 배열 출력 ---");
        int[] nums = {10, 20, 30};
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println();

        System.out.println("--- 2차원 배열 순회 ---");
        int[][] grid = {{1, 2}, {3, 4}};
        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println();


        System.out.println("--- 배열 리턴 메서드 사용 ---");
        int[] result = getData(); // 메서드 호출 및 결과 배열 저장
        System.out.println(result[1]); // 인덱스 1의 값 출력 (결과: 10)
    }


    public static int[] getData() {
        return new int[]{5, 10, 15};
    }

}
