package lv.jg.lesson4;

//OK
public class UserLoginService {

    public String login(String inputPassword, User user) {

        if (user.blocked == true) { //tā kā "user.blocked" ir booleam tipa, tad pietiek tik ar "if (user.blocked)"
            return "Your login is blocked";
        } else if (user.getPassword().equals(inputPassword)) {
            return "Login successful";
        } else if (user.getLoginsAttemtsLeft() < 0) {

            user.block();
            return "Your login is blocked";
        } else {

            user.removeAttemt();
            verify(user);
            return "Wrong password";
        }
    }

    public void verify(User user) {
        if (user.getLoginsAttemtsLeft() <= 0) {
            user.block();
        }
    }

    //šeit nav jābūt šai metodei
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
