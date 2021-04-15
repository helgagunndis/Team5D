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
}
