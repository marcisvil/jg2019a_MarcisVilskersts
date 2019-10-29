package lv.jg.lesson5;

import java.util.Objects;

public class Employee {

    private String contactNumber;
    private double salary;
    Department department;

    public Employee(String contactNumber, double salary, Department department){
        this.contactNumber= contactNumber;
        this.salary= salary;
        this.department = department;
    }

    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public String getContactNumber(){
        return this.contactNumber;
    }

    public void setSalary (double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return this.contactNumber.equals(employee.contactNumber)&&this.salary==employee.salary&&this.department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, contactNumber, department);
    }

    @Override
    public String toString() {
        return "Employee contact number : " + contactNumber
                + " his/her salary - " + salary + " eur"
                + " His/her department : " + department.getDepartmentName()
                + ", from a company called " + department.company.getCompanyName();
    }




}
