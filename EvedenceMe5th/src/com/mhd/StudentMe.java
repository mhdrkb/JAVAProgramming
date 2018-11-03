package com.mhd;
public class StudentMe {
    private int ID;
    private String name;
    private String pass;
    private String email;
    private int age;
    private String gender;
    private String hobby;
    private String Round;
    private String message;

    public StudentMe() {
    }
    

    public StudentMe(int ID, String name, String pass, String email, int age, String gender, String hobby, String Round, String message) {
        this.ID = ID;
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.Round = Round;
        this.message = message;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return Round;
    }

    public String getMessage() {
        return message;
    }
    
    
    
}
