package sample;


import javafx.collections.ObservableList;

import java.util.concurrent.atomic.AtomicReference;

public class TourUserController {
    private TourDataFactory tourdataFactory = new TourDataFactory();
    ObservableList<User> users= tourdataFactory.getUsers();

    public User findUserByID(String ID){
        AtomicReference<User> user = null;
        users.forEach((tab) -> {
            String userID=tab.getUserID();
            if (userID==ID){
                user.set(new User(tab.getUserID(), tab.getUserName(), tab.getUserEmail()));
                return;
            }
        });
        return user.get();
    }

    public void addNewUser(User user) {
        users.add(user);
    }

    public void updateUser(String userID) {
        users.forEach((tab) -> {
            String ID = tab.getUserID();
            if (userID == ID) {
                tab.setUserName(tab.getUserName());
                tab.setUserEmail(tab.getUserEmail());
            }
        });
    }

}
