package AbstractFactoryMethod;

public class AndroidDevFactory2 extends EmployeeAbstractFactory2{
        public EmployeeInterface2 createEmployee() {
            return new AndriodDeveloper2();
        }
} 
