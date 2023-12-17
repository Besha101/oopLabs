package org.example.week10.a1stTask;

public class MessagingSystem {
    @CanSendMessage
    @RequiresPermission("USER")
    public static void sendMessage(User user,String message){
        System.out.println("Restricted to send message");
    }

    @CanSendMessage
    @RequiresPermission("ADMIN")
    public static void sendMessage(Admin admin, String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        User user=new User("Ferhat");
        Admin admin=new Admin("Besha");

        sendMessage(user,"Nesto");
        sendMessage(admin,"Nesto");
    }
}
