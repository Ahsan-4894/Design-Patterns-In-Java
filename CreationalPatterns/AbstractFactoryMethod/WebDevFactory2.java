package AbstractFactoryMethod;

public class WebDevFactory2 extends EmployeeAbstractFactory2 {
    public EmployeeInterface2 createEmployee() {
        return new WebDeveloper2();
    }
}
