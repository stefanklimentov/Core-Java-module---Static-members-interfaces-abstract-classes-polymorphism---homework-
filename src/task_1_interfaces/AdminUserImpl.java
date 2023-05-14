package task_1_interfaces;

import java.util.Date;

public class AdminUserImpl extends AbstractUser implements AdminUser {

    public AdminUserImpl(String username, Date registrationDate) {
        super(username, registrationDate);
    }

    @Override
    public void addUser(User user) {
        System.out.println("Admin added user: " + user.getUsername());
    }

    @Override
    public void removeUser(User user) {
        System.out.println("Admin removed user: " + user.getUsername());
    }
}



