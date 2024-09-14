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

public class Teacher extends Person {
    private int yearsInProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        super();
        this.yearsInProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0.0;
    }

    public int getYearsInProfession() {
        return yearsInProfession;
    }

    public void setYearsInProfession(int yearsInProfession) {
        this.yearsInProfession = yearsInProfession;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }
   

    @Override
    public void inputAll() {
        super.inputAll();
        this.yearsInProfession = InputHelper.inputInt("Years in profession: ", 0, 100);  // Số năm kinh nghiệm
        this.contractType = InputHelper.inputString("Contract type (Long/Short): ", 5);
        this.salaryCoefficient = InputHelper.inputInt("Salary coefficient: ", 0, 100);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Years in profession: " + yearsInProfession + " - Contract type: " + contractType
                + " - Salary coefficient: " + salaryCoefficient);
    }
}

