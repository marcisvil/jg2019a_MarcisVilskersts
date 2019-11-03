package lv.jg.lesson5;

import java.util.Objects;

public class  Company {

    private String name;
    private String registrationNumber;

    public Company(String name, String registrationNumber){
        this.name=name;
        this.registrationNumber=registrationNumber;
    }

    public void setCompanyName(String name){
        this.name= name;
    }

    public String getCompanyName(){
        return this.name;
    }

    public void setCompanyRegistrationNumber(String registrationNumber){
        this.registrationNumber=registrationNumber;
    }

    public String getCompanyRegistrationNumber (){
        return this.registrationNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Company company = (Company) object;
        //nez vai "name" ir vajadzīgs, jo logiski ņemot nezvai kompanijas ar dažādiem
        // nosaukumiem un vienadiem numuriem varētu eksistēt
        return this.name.equals(company.name) && this.registrationNumber.equals(company.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registrationNumber);
    }

    @Override
    public String toString() {
        return "Company name : " + name
                +" Registration number : " + registrationNumber;
    }


}
