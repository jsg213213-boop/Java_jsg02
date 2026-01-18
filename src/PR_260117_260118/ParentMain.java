package PR_260117_260118;

public class ParentMain {
    public static void main(String[] args) {
        Child_ex child1 = new Child_ex();
        child1.hello();
        System.out.println("순서8,  자식 hello() 내용 호출 종료");
        System.out.println("순서9,  main() 호출 종료");

    }

}
