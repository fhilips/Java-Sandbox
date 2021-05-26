package rc.bootsecurity.model;

import javax.persistence.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private int active;

    @ManyToMany(mappedBy="users", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<Role>();

 //   private String permissions = "";

    public User(String username, String password, List<Role> roles){
        this.username = username;
        this.password = password;
        this.roles = roles;
//        this.permissions = permissions;
        this.active = 1;
    }

    protected User(){}

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getActive() {
        return active;
    }

    public List<Role> getRoles() {
        return roles;
    }

//    public String getPermissions() {
//        return permissions;
//    }

    public List<Role> getRoleList(){
//        if(this.roles.length() > 0){
//            return Arrays.asList(this.roles.split(","));
//        }
        return roles;
    }

//    public List<String> getPermissionList(){
//        if(this.permissions.length() > 0){
//            return Arrays.asList(this.permissions.split(","));
//        }
//        return new ArrayList<>();
//    }
}
