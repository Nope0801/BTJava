package MVC.Model;

public class LoginModel {
    private String user;
    private String pass;
    public LoginModel(){}
    public LoginModel(String _user, String _pass){
        this.user = _user;
        this.pass = _pass;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPass() {
        return pass;
    }   
    public void setPass(String pass) {
        this.pass = pass;
    }
}
