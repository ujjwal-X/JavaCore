package designpattern.builder.user;

public class User {
    private final String user_id;
    private final String userName;
    private final String emailId;

    User(UserBuilder u){
        this.userName=u.userName;
        this.user_id=u.user_id;
        this.emailId=u.emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }


     static class UserBuilder{
         private String user_id;
         private String userName;
         private String emailId;

         public UserBuilder(){

         }

         public void setUser_id(String user_id) {
             this.user_id = user_id;
         }

         public void setUserName(String userName) {
             this.userName = userName;
         }

         public void setEmailId(String emailId) {
             this.emailId = emailId;
         }

     }
}
