package entity;

public class User extends Person {

    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo() {
        String a = "Имя: " + firstName + " " + lastName + "\n" + "E-mail:  " + email;
        return a;
    }

    public boolean isPasswordCorrect(String password) {
        if (this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
