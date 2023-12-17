package org.example.week10.a1stTask;

@UserPermission(level="ADMIN")
public class Admin {
    private String username;

    public Admin(String username) {
        this.username = username;
    }
}
