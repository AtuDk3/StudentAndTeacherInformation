/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
import common.InputHelper;

public class Person {
    protected String id;
    protected String fullName;
    protected String phoneNumber;
    protected int yearOfBirth;
    protected String major;

    public Person() {
        this.id = "";
        this.fullName = "";
        this.phoneNumber = "";
        this.yearOfBirth = 0;
        this.major = "";
    }
    
    // Getters và setters cho các thuộc tính
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public int getYearOfBirth() { return yearOfBirth; }
    public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public void inputAll() {
        this.id = InputHelper.inputString("ID: ", 6);
        this.fullName = InputHelper.inputFullName("Fullname: ");
        this.phoneNumber = InputHelper.inputPhoneNumber("Phone number: ");
        this.yearOfBirth = InputHelper.inputInt("Year of birth: ", 1900, 2024);
        this.major = InputHelper.inputString("Major: ", 30);
    }

    public void printInfo() {
        System.out.println("ID: " + id + " - Fullname: " + fullName + " - Phone number: " + phoneNumber
                + " - Year of birth: " + yearOfBirth + " - Major: " + major);
    }
}

