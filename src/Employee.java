public class Employee {
    private String name;
    private String surname;
    private int age;
    private String floor;
    private String obrvizovanie;
    private String position;
    private String department;

    public Employee(String name, String surname, int age, String floor, String obrvizovanie, String position, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.floor = floor;
        this.obrvizovanie = obrvizovanie;
        this.position = position;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getObrvizovanie() {
        return obrvizovanie;
    }

    public void setObrvizovanie(String obrvizovanie) {
        this.obrvizovanie = obrvizovanie;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", floor='" + floor + '\'' +
                ", obrvizovanie='" + obrvizovanie + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
