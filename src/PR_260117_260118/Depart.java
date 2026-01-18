package PR_260117_260118;

class Employee {
    protected String department;
    public Employee(String department) {
        this.department = department;
    }
}
class Manager extends Employee {
    public Manager(String department) {
        super(department);
    }
    public void printDept() {
        System.out.println("소속 부서 : " + this.department);
    }
}

public class Depart {
    public static void main(String[] args) {

        Manager m1 = new Manager("개발팀");
        Manager m2 = new Manager("기획팀");
        Manager m3 = new Manager("총무팀");
        Manager m4 = new Manager("영업팀");
        Manager m5 = new Manager("전산팀");

        System.out.println("=== 매니저 부서 정보 ===");
        m1.printDept();
        m2.printDept();
        m3.printDept();
        m4.printDept();
        m5.printDept();
    }

}
