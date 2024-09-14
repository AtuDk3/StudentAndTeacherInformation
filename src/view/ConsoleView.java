/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public int displayMainMenu() {
        System.out.println("*** Information Management ***");
        System.out.println("1. Teacher");
        System.out.println("2. Student");
        System.out.println("3. Person");
        System.out.println("4. Exit");
        System.out.print("You choose: ");
        return scanner.nextInt();
    }

    public int displayTeacherMenu() {
        System.out.println("*** Teacher Management ***");
        System.out.println("1. Input Teacher Information");
        System.out.println("2. Print Teacher Information");
        System.out.println("3. Exit");
        System.out.print("You choose: ");
        return scanner.nextInt();
    }

    public int displayStudentMenu() {
        System.out.println("*** Student Management ***");
        System.out.println("1. Input Student Information");
        System.out.println("2. Print Student Information");
        System.out.println("3. Exit");
        System.out.print("You choose: ");
        return scanner.nextInt();
    }

    public int displayPersonMenu() {
        System.out.println("*** Person Management ***");
        System.out.println("1. Search Person by Name");
        System.out.println("2. Print All People");
        System.out.println("3. Exit");
        System.out.print("You choose: ");
        return scanner.nextInt();
    }

    public String inputSearchName() {
        System.out.print("Enter the name you want to search for: ");
        return scanner.next();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

