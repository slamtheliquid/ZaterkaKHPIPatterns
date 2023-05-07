package Lab6;

import java.util.List;

class Department {
    private final List<Employee> employees;

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void accept(Visitor visitor) {
        visitor.visitDepartment(this);
    }
}
