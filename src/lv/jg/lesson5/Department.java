package lv.jg.lesson5;

import java.util.Objects;

public class Department {

    private String name;
    Company company;

    public Department(String name, Company company){
        this.name=name;
        this.company=company;
    }

    public void setDepartmentName(String name){
        this.name=name;
    }

    public String getDepartmentName(){
        return this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Department department = (Department) object;
        return this.name.equals(department.name)&&this.company.equals(department.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return "Department : " + name
        + " of " + company.getCompanyName();
    }

}
