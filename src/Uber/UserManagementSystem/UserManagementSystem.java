package Uber.UserManagementSystem;



import java.util.List;

public class UserManagementSystem {

    List<User>userList;
    private static volatile UserManagementSystem instance;
    private UserManagementSystem(){

    }
    public static UserManagementSystem getInstance(){
        if(instance==null)
        {
            synchronized (UserManagementSystem.class)
            {
                if(instance==null)
                    instance=new UserManagementSystem();
            }
        }
        return instance;
    }
    public void addUser(User user)
    {
        userList.add(user);
    }
}
