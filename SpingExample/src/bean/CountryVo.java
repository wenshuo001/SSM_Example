package bean;

import java.util.List;

public class CountryVo extends Country{

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    private List<User> userList;

    @Override
    public String toString() {
        return super.toString()+ " userList=" + userList;
    }
}
