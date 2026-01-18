package PR_260117_260118;

public class Animal_ex {
    protected String name;

    public void speak() {
        System.out.println("반려동물이 소리를 내면서 주인에게 다가갑니다.");
    }
}

class AnimalCat_ex extends Animal_ex {

    public void bark() {
        System.out.println(name + "가 야옹하면서 집사에게 다가가 안겼습니다!");
    }
}

class AnimalMain_ex {
    public static void main(String[] args) {
        AnimalCat_ex cat1 = new AnimalCat_ex();
        cat1.name = "흰둥이"; // 부모 클래스의 변수
        cat1.speak(); // 부모 클래스의 메서드 이용.
        cat1.bark(); // 자식 클래스의 (본인) 메서드
        System.out.println("cat의 이름 : " + cat1.name);
    }

}
