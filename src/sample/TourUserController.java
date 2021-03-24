package sample;


import javafx.collections.ObservableList;

import java.util.concurrent.atomic.AtomicReference;

public class TourUserController {
    private TourDataFactory tourdataFactory = new TourDataFactory();
    ObservableList<User> users= tourdataFactory.getUsers();

    public void addUser(User user) {
        String name= user.getUserName();
        String SSN= user.getUserID();
        String email= user.getUserEmail();
        AtomicReference<Boolean> newUser= new AtomicReference<>(true);
        users.forEach((tab) -> {
            String userID=tab.getUserID();
            if (userID==SSN){
                newUser.set(false);
                String nameID=tab.getUserName();
                if (nameID!=name){
                    tab.setUserName(nameID);
                }
                String emailID= tab.getUserEmail();
                if (emailID!=email){
                    tab.setUserEmail(emailID);
                }
                return;
            }
        });
        if (newUser.get()){
            users.add(user);
        }
    }
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

}
