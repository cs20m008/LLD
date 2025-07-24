package PaymentSystem_GPay.UserManager;

import java.util.List;

public class UserManager {
    List<User>userList;
    private static volatile UserManager instance;
    private UserManager(){

    }
    public static UserManager getInstance()
    {
        if(instance==null)
        {
            synchronized (UserManager.class)
            {
                if(instance==null)
                {
                    instance=new UserManager();
                }
            }
        }
        return instance;
    }
    public void addUser(User user)
    {
        userList.add(user);
    }
    public void removeUser(User user)
    {
        userList.remove(user);
    }
}
