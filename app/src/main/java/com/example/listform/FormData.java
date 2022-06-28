package com.example.listform;

import androidx.annotation.NonNull;

public class FormData {
    public Name name;
    public String regNo;
    public String rollNo;
    public String section;
    public String mobile;
    public String email;

    public FormData() {
        this.name = new Name();
    }

    public String getFullName() { return name.getFullName(); }
    public String getFirstName() { return name.getFirstName(); }
    public String getLastName() { return name.getLastName(); }
    public String getRegNo() { return regNo; }
    public String getRollNo() { return rollNo; }
    public String getSection() { return section; }
    public String getMobile() { return mobile; }
    public String getEmail() { return email; }


    public void setFullName(String name) { this.name.setFullName(name); }
    public void setFirstName(String name) { this.name.setFirstName(name); }
    public void setLastName(String name) { this.name.setLastName(name); }
    public void setRegNo(String regNo) { this.regNo = regNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }
    public void setSection(String section) { this.section = section; }
    public void setMobile(String mobile) { this.mobile = mobile; }
    public void setEmail(String email) { this.email = email; }
}

class Name {
    public String firstName;
    public String lastName;

    public Name() {
        this.firstName = "";
        this.lastName = "";
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(String name) {
        setFullName(name);
    }

    public void setFirstName(@NonNull String name) { this.firstName = name; }
    public void setLastName(@NonNull String name) { this.lastName = name; }
    public void setFullName(@NonNull String name) {
        String[] arr;
        arr = name.split(" ");

        this.firstName = arr[0];
        if (arr.length < 2) {
            this.lastName = "";
            return;
        }
        this.lastName = arr[1];
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return firstName + " " + lastName; }

}
