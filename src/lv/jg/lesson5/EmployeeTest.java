package lv.jg.lesson5;

public class EmployeeTest {

    public static void main(String[] args) {


        //neanāca vairāk laika, bet par visu, ko daru, ir sapratne

        Company company = new Company("SONY", "sdgasgdf");
        Department department = new Department("Manufacturing", company);
        Employee employee = new Employee("45618651", 1000, department);


        Company company1 = new Company("SONY", "sdgasgdf");
        Department department1 = new Department("Manufacturing", company1);
        Employee employee1 = new Employee("45618651", 1000, department1);


        System.out.println(company);


        System.out.println(department);


        System.out.println(employee);

        System.out.println(employee.equals(employee1));


    }

}
