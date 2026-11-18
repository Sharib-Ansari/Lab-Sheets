
public class UserBean {
    private String password;

    public UserBean() {
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        UserBean u = new UserBean();
        u.setPassword("abc123");
        System.out.println("Password has been set successfully.");
    }
}
