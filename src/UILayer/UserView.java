package UILayer;

import AppLayer.User;

import java.util.Scanner;

/**
 * Created by jonb on 12/03/17.
 */
public class UserView
{
    public void showUser(User userObject)
    {
        System.out.printf("Bruger: %s, kodeord: %s%n",userObject.getUserName(), userObject.getUserPassword());
    }
}
