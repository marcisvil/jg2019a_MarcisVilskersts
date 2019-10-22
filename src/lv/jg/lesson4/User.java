package lv.jg.lesson4;

public class User {

    String login;
    String password;
    int loginAtemtsLeft;
    boolean blocked;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        loginAtemtsLeft = 3;
        blocked = false;
    }

    public void resetLoginAttemts() {
        this.loginAtemtsLeft = 3;
        this.blocked = false;
        System.out.println("your login is renewed");
    }

    public void block() {
        this.blocked = true;
    }

    public String getPassword() {
        return this.password;
    }

    public int getLoginsAttemtsLeft(){
        return loginAtemtsLeft;
    }

    public void removeAttemt() {
        this.loginAtemtsLeft = loginAtemtsLeft - 1;
    }

}
