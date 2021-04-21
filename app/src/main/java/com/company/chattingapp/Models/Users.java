package com.company.chattingapp.Models;

public class Users {

    String profilePic , userName , mail , password , uwerId , lastMessage;

    public Users(String profilePic, String userName, String mail, String password, String uwerId, String lastMessage) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.uwerId = uwerId;
        this.lastMessage = lastMessage;
    }

    public String getUwerId() {
        return uwerId;
    }

    public void setUwerId(String uwerId) {
        this.uwerId = uwerId;
    }

    public Users(){}


    // SignUp Constructor

    public Users(String userName, String mail, String password) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
    }


    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
