package framework.entity;

public class Users {

    public String UserType;
    public String UN;
    public String PWD;


    public Users(String userType, String UN, String PWD) {
        this.UserType = userType;
        this.UN = UN;
        this.PWD = PWD;
    }
}
