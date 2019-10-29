package lv.jg.lesson4;

//Ok
public class UserLoginServiceTest {

    public void test() {
        UserLoginService victim = new UserLoginService();
        User loginVictim = new User("SweetLoginName", "hiddenWord");

        String expectedResult = "Login successful";
        String actualResult = victim.login("hiddenWord", loginVictim);

        check(expectedResult, actualResult);
    }

    public void check(String expectedResult, String actualResult) {

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test NOT successful");
        }

    }

    public static void main(String[] args) {
        UserLoginServiceTest userLoginServiceTest = new UserLoginServiceTest();
        userLoginServiceTest.test();
    }


}
