package lv.jg.lesson4;

public class UserLoginService {

    public void login(String inputPassword, User user) {

        if (user.blocked == true) {
            System.out.println("Your login is blocked");
        } else if (user.getPassword().equals(inputPassword)) {
            System.out.println("Login successful");
        } else if (user.getLoginsAttemtsLeft() < 0) {
            System.out.println("Your login is blocked");
            user.block();
        } else {
            System.out.println("Wrong password");
            user.removeAttemt();
            verify(user);
        }
    }

    public void verify(User user) {
        if (user.getLoginsAttemtsLeft() <= 0) {
            user.block();
        }
    }

    public static void main(String[] args) {

        UserLoginService userLoginService = new UserLoginService();

        User userOne = new User("CoolLoginName", "abc");

        userLoginService.login("abcd", userOne);
        userLoginService.login("abcd", userOne);
        userLoginService.login("abcd", userOne);
        userLoginService.login("abcd", userOne);
        userLoginService.login("abcd", userOne);
        userLoginService.login("abcd", userOne);
        userLoginService.login("abcd", userOne);

        userOne.resetLoginAttemts();

        userLoginService.login("abcd", userOne);
        userLoginService.login("abc", userOne);
    }
}
