package PR_260117_260118;

public class Person_02 {
    String name;

    public Person_02(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");
    }
}

class Main {
    public static void main(String[] args) {
        // 수정: 클래스 이름을 Person_2_Point로 일치시킴
        Person_02 p = new Person_02("정성규");
        p.sayHello();
    }

}
