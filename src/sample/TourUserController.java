package sample;

import javafx.collections.ObservableList;

public class TourUserController {
    private TourDataFactory tourdataFactory = new TourDataFactory();

    public User findUserByID(String ID){
        ObservableList<User> users = tourdataFactory.getUsers();
        User theUser = null;
        for (User user : users) {
            if (user.getUserID().equals(ID)){
                theUser=user;
            }
        }
        return theUser;
    }

    public void addNewUser(User user) {
        tourdataFactory.insertUser(user);
    }

    public boolean isUserInSystem(String userID){
        ObservableList<User> users = tourdataFactory.getUsers();
        boolean inSystem= false;
        for (User user : users) {
            if (user.getUserID().equals(userID)){
                inSystem= true;
            }
        }
        return inSystem;
    }
}
