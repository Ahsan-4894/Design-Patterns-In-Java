package AbstractFactoryMethod;

public class Client2 {
    public static void main(String[] args) {
        EmployeeInterface2 e1 = EmployeeFactory2.getEmployee(new AndroidDevFactory2());

        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        EmployeeInterface2 e2 = EmployeeFactory2.getEmployee(new WebDevFactory2());
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());

    }
}
