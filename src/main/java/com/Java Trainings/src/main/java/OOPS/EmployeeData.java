package OOPS;

public class EmployeeData {

    //Private data variables

    private int ssn;
    private String empName;
    private int empAge;

    public static void main(String[] args){
        EmployeeData emp=new EmployeeData();
        emp.setEmpAge(25);
        emp.setEmpName("Tom");
        emp.setSsn(777777777);

        System.out.println("emp name is:" + emp.getEmpName());
        System.out.println("emp ssn number:" + emp.getSsn());
        System.out.println("emp age:"+ emp.getEmpAge());

    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
