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

public class Student extends Person {
    private int yearOfAdmission;
    private int entranceEnglishScore;

    public Student() {
        super();
        this.yearOfAdmission = 0;
        this.entranceEnglishScore = 0;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getEntranceEnglishScore() {
        return entranceEnglishScore;
    }

    public void setEntranceEnglishScore(int entranceEnglishScore) {
        this.entranceEnglishScore = entranceEnglishScore;
    }
    
    

    @Override
    public void inputAll() {
        super.inputAll();
        this.yearOfAdmission = InputHelper.inputInt("Year of admission: ", yearOfBirth, 2023);  // Phải lớn hơn năm sinh
        this.entranceEnglishScore = InputHelper.inputInt("Entrance English score: ", 0, 100);   // Điểm từ 0 đến 100
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Year of admission: " + yearOfAdmission + " - Entrance English score: " + entranceEnglishScore);
    }
}

