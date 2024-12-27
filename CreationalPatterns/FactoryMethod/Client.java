package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        EmployeeInterface e1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        EmployeeInterface e2 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");

        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        System.out.println(e2.getName());
        System.out.println(e2.getSalary());

    }
}
