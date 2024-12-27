package FactoryMethod;

public class EmployeeFactory {

    public static EmployeeInterface getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else if (empType.trim().equalsIgnoreCase("ANDRIOD DEVELOPER")) {
            return new AndriodDeveloper();
        } else {
            return null;
        }
    }

}
