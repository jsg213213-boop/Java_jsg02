package PR_260124_260125;

import java.util.Scanner;

interface Joinable {
    void join();

}

abstract class MemberBase {
    protected String name;
    protected String email;
    protected String password; // 비밀번호 필드
    protected int age;

    public MemberBase(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public abstract void showInfo();


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name; // name 필드 반환
    }

    public int getAge() {
        return age; // age 필드 반환 (타입이 String일 경우)
    }

    static class NormalMember extends MemberBase implements Joinable {


        public NormalMember(String name, String email, String password, int age) {
            super(name, email, password, age);
        }

        @Override
        public void join() {
            System.out.println("✅ " + name + "님 회원가입이 완료되었습니다.");
        }

        @Override
        public void showInfo() {
            System.out.println("[이름: " + name + " | 이메일: " + email + " | 나이: " + age + "]");
        }
    }

    public class MainClass {
        public static void main(String[] args) {
            MemberBase[] members = new MemberBase[5];
            int count = 0;
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n============= 회원 관리 시스템 ver 1.1 =============");
                System.out.println("1. 회원가입  2. 목록조회  3. 종료");
                System.out.print("메뉴 선택 >> ");

                int choice;
                try {
                    choice = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ 숫자만 입력해주세요.");
                    continue;
                }

                switch (choice) {
                    case 1: // 회원 가입
                        if (count >= members.length) {
                            System.out.println("❌ 정원초과입니다.");
                            break;
                        }
                        System.out.print("이름: ");
                        String name = sc.nextLine();
                        System.out.print("이메일: ");
                        String email = sc.nextLine();
                        System.out.print("비밀번호: ");
                        String password = sc.nextLine(); // 입력받는 변수명 확인
                        System.out.print("나이: ");
                        int age = Integer.parseInt(sc.nextLine());

                        NormalMember newMember = new NormalMember(name, email, password, age);
                        members[count] = newMember;
                        newMember.join();
                        count++;
                        break;

                    case 2:
                        System.out.println("\n--- 전체 회원 목록 ---");
                        if (count == 0) System.out.println("가입된 회원이 없습니다.");
                        for (int i = 0; i < count; i++) {
                            members[i].showInfo();
                        }
                        break;

                    case 3:
                        System.out.println("프로그램을 종료합니다.");
                        sc.close();
                        return;

                    default:
                        System.out.println("번호를 다시 확인해주세요.");
                }
            }
        }
    }
}
