package sample;


import javafx.collections.ObservableList;

import java.util.concurrent.atomic.AtomicReference;

public class TourUserController {
    private TourDataFactory tourdataFactory = new TourDataFactory();
    private ObservableList<User> users= tourdataFactory.getUsers();

    public User findUserByID(String ID){
        AtomicReference<User> user = null;
        users.forEach((tab) -> {
            if (tab.getUserID()==ID){
                user.set(new User(tab.getUserID(), tab.getUserName(), tab.getUserEmail()));
                return;
            }
        });
        return user.get();
    }

    public void addNewUser(User user) {
        users.add(user);
    }
}
