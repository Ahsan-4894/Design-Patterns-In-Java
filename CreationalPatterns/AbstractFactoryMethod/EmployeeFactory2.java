package AbstractFactoryMethod;

public class EmployeeFactory2 {
    public static EmployeeInterface2 getEmployee(EmployeeAbstractFactory2 emp) {
        return emp.createEmployee();
    }
}
