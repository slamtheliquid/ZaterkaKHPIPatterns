package Lab6;

import java.util.List;

class Company {
    private final List<Department> departments;

    public Company(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }
}
