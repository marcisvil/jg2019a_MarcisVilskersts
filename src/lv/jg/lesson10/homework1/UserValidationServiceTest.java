package lv.jg.lesson10.homework1;

public class UserValidationServiceTest {

    public static void main(String[] args) {

        shouldFailWhenNameOrSurnameTooShort();
        shouldFailWhenNameOrSurnameTooLong();
        shouldFailWhenAgeTooSmall();
        shouldFailWhenAgeTooLarge();

    }

    private static void shouldFailWhenAgeTooLarge() {
        boolean result = false;
        try {
            User user = new User("Peter", "Daugavvanags", 150);

        }catch (ValidationException va){
            result = true;
        }
        System.out.println("Test shouldFailWhenAgeTooLarge: "
                + (result ? "SUCCESS" : "FAIL"));
    }

    private static void shouldFailWhenAgeTooSmall() {
        boolean result = false;
        try {
            User user = new User("Peter", "Daugavvanags", -1);

        }catch (ValidationException va){
            result = true;
        }
        System.out.println("Test shouldFailWhenAgeTooSmall: "
                + (result ? "SUCCESS" : "FAIL"));
    }

    private static void shouldFailWhenNameOrSurnameTooLong() {
        boolean result = false;
        try {
            User user = new User("Peter", "Daugavvanags-Berzins", 15);

        }catch (ValidationException va){
            result = true;
        }
        System.out.println("Test shouldFailWhenNameOrSurnameTooLong: "
                + (result ? "SUCCESS" : "FAIL"));
    }

    private static void shouldFailWhenNameOrSurnameTooShort() {
        boolean result = false;
        try {
            User user = new User("Pe", "Berzins", 15);

        }catch (ValidationException va){
            result = true;
        }
        System.out.println("Test shouldFailWhenNameOrSurnameTooShort: "
                + (result ? "SUCCESS" : "FAIL"));
    }
}
