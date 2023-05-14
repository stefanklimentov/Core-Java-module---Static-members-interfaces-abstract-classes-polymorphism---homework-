package task_1_interfaces;

import java.util.Date;

public abstract class AbstractUser implements User {
    protected String username;
    protected Date registrationDate;

    public AbstractUser(String username, Date registrationDate) {
        this.username = username;
        this.registrationDate = registrationDate;
    }

    @Override
    public void login() {
        System.out.println("User " + username + " logged in");
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public Date getRegistrationDate() {
        return registrationDate;
    }
}



