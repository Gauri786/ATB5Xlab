package src.opps_13Jan;

public class badexample {

    public static void main(String[] args) {
        fflogin fflogin = new fflogin("admin","password");
        //boolean check = fflogin.isLoggedIn("admin","wrong");
        //System.out.println("check");


        // for get the username
        boolean check = fflogin.isLoggedIn("admin","wrong");
        //System.out.println("check");
        String u = fflogin.getUsername();
        System.out.println(u);
    }
}


class fflogin {


    private String username = "username";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password = "password";

    public String getPassword() {
        return password;
    }

    public fflogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


    boolean isLoggedIn(String username, String password) {
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
              System.out.println("User Login");
                return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
}