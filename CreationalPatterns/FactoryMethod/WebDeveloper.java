package FactoryMethod;

public class WebDeveloper implements EmployeeInterface {
    public int getSalary() {
        return 20000;
    };

    public String getName() {
        return "Web Developer";
    };
};