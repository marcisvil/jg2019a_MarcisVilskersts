package lv.jg.lesson10.homework1;


public class User {

    private String name;
    private String lastName;
    private int age;

    public User(String name, String lastName, int age) {
        if (lengthCheck(name) || lengthCheck(lastName)) {
            throw new ValidationException("Name and surname has to be 3 to 15 characters long");
        }

        if (ageCheck(age)){
            throw  new ValidationException("Age must be within human possibility : 0-120");
        }

        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    private boolean lengthCheck(String name) {
        return name.length() < 3 || name.length() > 15;
    }

    private boolean ageCheck(int age) {
        return age < 0 || age >120;
    }
}
