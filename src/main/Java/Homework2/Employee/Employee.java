package Homework2.Employee;

public class Employee {
    private String fullName;
    private String department;
    private String email;
    private int phone;
    private int yearsOld;

    public Employee(String fullName, String department, String email, int phone, int yearsOld) {
        this.fullName = fullName;
        this.department = department;
        this.email = email;
        this.phone = phone;
        this.yearsOld = yearsOld;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

}