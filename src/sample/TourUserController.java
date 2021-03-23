package sample;


public class TourUserController{

    public void addUser(User user) {
        String name= user.getUserName();
        String SSN= user.getUserID();
        String email= user.getUserEmail();
        // nú þarf að setja þetta inn í data base-inn hjá User og bookingdafd
        System.out.println(name);
    }
    public User findUserByID(String userID){
        User user= new User(" ","","");
        return user;
    }

}
