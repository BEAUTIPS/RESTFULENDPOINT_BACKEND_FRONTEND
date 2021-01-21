package com.laioffer.testbackend.Model;

import java.util.Objects;

public class User {

    String bodyShape;
    String name = "";
    int age;
    String size;
    int numOfLikes = 0 ;
    String email = "";
    String password = "";


    public User() {}

    public User(int age, String size, String name) {
        this.age = age;
        this.size = size;
        this.name = name;

    }

    public void setEmail(String email){
        this.email = email;

    }
    public void setPassord(String password){
        this.password = password;

    }

    public void setBodyShape(String bodyShape) {
        this.bodyShape = bodyShape;
    }

    public void setName(String email){
        this.name = name;
    }

    public String getBodyShape() {
        return bodyShape;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +

                ", bodyShape='" + bodyShape + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", numOfLikes=" + numOfLikes +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                size == user.size &&
                numOfLikes == user.numOfLikes &&

                Objects.equals(bodyShape, user.bodyShape) &&
                Objects.equals(name, user.name) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyShape, name, age, size, numOfLikes, email, password);
    }
}

