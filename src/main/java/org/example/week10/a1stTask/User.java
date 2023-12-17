package org.example.week10.a1stTask;

@UserPermission(level="USER")
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }
}
