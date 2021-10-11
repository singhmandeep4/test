package Inheritance;
class Login{
    void loginCredential(){
        System.out.println("Enter Username and Password");
    }
}
class Dashboard extends Login{
    void validateDashboard(){
        System.out.println("User is on dashboard screen");
    }
}
class Logout extends Dashboard{
    void logout(){
        System.out.println("User logout successfully");
    }
}
public class Multilevel_Inht {
    public static void main(String args[]){
        Logout user=new Logout();
        user.loginCredential();
        user.validateDashboard();
        user.logout();
    }

}
