import AppLayer.Users;
import ControllerLayer.UsersController;
import DataLayer.UsersDb;
import UILayer.UsersView;

public class Main {

    public static void main(String[] args) {

        Users usersList = new Users();
        UsersView usersView = new UsersView();
        UsersDb usersDb = new UsersDb();
        UsersController usersController = new UsersController(usersList, usersView, usersDb);

        usersController.usersMenuController ();
    }
}
