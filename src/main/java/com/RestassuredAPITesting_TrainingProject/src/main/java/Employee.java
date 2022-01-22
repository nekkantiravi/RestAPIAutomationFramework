public class Employee {
    private String firstname;
    private String lastname;
    private String designation;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                ']';
    }
}
