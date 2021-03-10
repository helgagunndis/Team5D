package sample;

public class User {
    private int userID;
    private String userName;
    private String userEmail;
    private String userAdress;

    public User(int userID, String userName, String userEmail, String userAdress) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAdress = userAdress;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }
}
