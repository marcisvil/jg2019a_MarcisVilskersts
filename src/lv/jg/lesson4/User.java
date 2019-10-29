package lv.jg.lesson4;

//Ok
public class User {

<<<<<<< HEAD
    private String login;
    private String password;
    private int loginAtemtsLeft;
=======
    //klases laukiem jābūt "private"
    String login;
    String password;
    int loginAtemtsLeft;            //typo
>>>>>>> origin/master
    boolean blocked;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        loginAtemtsLeft = 3;
        blocked = false;
    }

    public void resetLoginAttemts() {  //typo
        this.loginAtemtsLeft = 3;
        this.blocked = false;
        System.out.println("your login is renewed");
    }

    public void block() {
        this.blocked = true;
    }

    public String getPassword() {
        return this.password;
    }//typo

    public int getLoginsAttemtsLeft(){
        return loginAtemtsLeft;
    }

    public void removeAttemt() {   //typo, labaks nosaukums būtu "decreaseAttempts"
        this.loginAtemtsLeft = loginAtemtsLeft - 1;
        //šeit labak izmantot šo pieeju "this.loginAtemtsLeft--"
    }

}
