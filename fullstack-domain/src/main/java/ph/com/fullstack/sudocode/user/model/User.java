package ph.com.fullstack.sudocode.user.model;

import ph.com.fullstack.sudocode.base.model.Roles;

public class User {

    private String userName;
    private String email;
    private Roles roles;

    public User() {
    }

    public User(String userName, String email, Roles roles) {
        this.userName = userName;
        this.email = email;
        this.roles = roles;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
