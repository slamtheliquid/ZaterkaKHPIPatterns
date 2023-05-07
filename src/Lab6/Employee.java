package Lab6;

class Employee {
    private final String position;
    private final int salary;

    public Employee(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void accept(Visitor visitor) {
        visitor.visitEmployee(this);
    }
}
