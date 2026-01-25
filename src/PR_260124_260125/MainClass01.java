package PR_260124_260125;

import java.util.Scanner;

// 1. 인터페이스 정의
interface Joinable {
    void join();
}

// 2. 부모 추상 클래스
abstract class MemberBase {
    protected String name;
    protected String email;
    protected String password;
    protected int age;

    public MemberBase(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public abstract void showInfo();

    // Getter & Setter (매개변수 불일치 에러 해결 버전)
    public String getName() { return name; }
    public void setName(String s) { this.name = s; }
    public void setEmail(String s) { this.email = s; }
    public void setPassword(String s) { this.password = s; }
    public void setAge(int i) { this.age = i; }

    public String getEmail() {
        return email;
    }

    // 비밀번호 반환 (String 타입으로 변경)
    public String getPassword() {
        return password;
    }

    // 나이 반환 (int 타입으로 변경)
    public int getAge() {
        return age;
    }

    // 요청하신 public static 내부 클래스 방식
    public static class NormalMember extends MemberBase implements Joinable {

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
    } // NormalMember 끝
} // MemberBase 끝

// 3. 실행 클래스 (파일 이름은 반드시 MainClass01.java 여야 합니다)
public class MainClass01 {
    public static void main(String[] args) {
        // static 내부 클래스이므로 MemberBase.NormalMember 형태로 호출하거나 직접 사용 가능
        MemberBase[] members = new MemberBase[5];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n============= 회원 관리 시스템 ver 1.1 =============");
            System.out.println("1. 회원가입  2. 목록조회  3. 종료");
            System.out.print("메뉴 선택 >> ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                if (count >= members.length) {
                    System.out.println("❌ 정원초과!");
                    continue;
                }
                System.out.print("이름: "); String name = sc.nextLine();
                System.out.print("이메일: "); String email = sc.nextLine();
                System.out.print("비밀번호: "); String pw = sc.nextLine();
                System.out.print("나이: "); int age = Integer.parseInt(sc.nextLine());

                // 내부 클래스 객체 생성
                MemberBase.NormalMember newMember = new MemberBase.NormalMember(name, email, pw, age);
                members[count++] = newMember;
                newMember.join();

            } else if (choice == 2) {
                for (int i = 0; i < count; i++) members[i].showInfo();
            } else if (choice == 3) {
                break;
            }
        }
        sc.close();
    }
}