package designpattern.builder.user;

public class Main {
    public static void main(String[] args) {
        User.UserBuilder setvalue=new User.UserBuilder();
        setvalue.setUserName("Vishal");
        setvalue.setEmailId("vishal@gmail.com");
        setvalue.setUser_id("1");
        User u=new User(setvalue);
        System.out.println(u);
    }
}
