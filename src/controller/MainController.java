/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import model.Person;
import model.Student;
import model.Teacher;
import view.ConsoleView;

public class MainController {
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private ConsoleView view = new ConsoleView();

    public void run() {
        int mainChoice;
        do {
            mainChoice = view.displayMainMenu();
            switch (mainChoice) {
                case 1:
                    manageTeachers();
                    break;
                case 2:
                    manageStudents();
                    break;
                case 3:
                    managePersons();
                    break;
                case 4:
                    view.displayMessage("BYE AND SEE YOU NEXT TIME");
                    break;
                default:
                    view.displayMessage("Invalid choice. Try again.");
            }
        } while (mainChoice != 4);
    }

    private void manageTeachers() {
        int teacherChoice;
        do {
            teacherChoice = view.displayTeacherMenu();
            switch (teacherChoice) {
                case 1:
                    inputTeacher();
                    break;
                case 2:
                    printTeachers();
                    break;
                case 3:
                    view.displayMessage("Exiting Teacher Management...");
                    break;
                default:
                    view.displayMessage("Invalid choice. Try again.");
            }
        } while (teacherChoice != 3);
    }

    private void inputTeacher() {
        Teacher teacher = new Teacher();
        teacher.inputAll();
        teachers.add(teacher);
        view.displayMessage("Teacher added successfully.");
    }

    private void printTeachers() {
        if (teachers.isEmpty()) {
            view.displayMessage("No teachers available.");
        } else {
            teachers.sort(Comparator.comparingInt(Teacher::getYearOfBirth)); // Sorting by year of birth
            view.displayMessage("# - ID - Fullname - Phone number - Year of birth - Major - Year in the profession - Contract type - Salary coefficient");
            for (Teacher teacher : teachers) {
                teacher.printInfo();
            }
        }
    }

    private void manageStudents() {
        int studentChoice;
        do {
            studentChoice = view.displayStudentMenu();
            switch (studentChoice) {
                case 1:
                    inputStudent();
                    break;
                case 2:
                    printStudents();
                    break;
                case 3:
                    view.displayMessage("Exiting Student Management...");
                    break;
                default:
                    view.displayMessage("Invalid choice. Try again.");
            }
        } while (studentChoice != 3);
    }

    private void inputStudent() {
        Student student = new Student();
        student.inputAll();
        students.add(student);
        view.displayMessage("Student added successfully.");
    }

    private void printStudents() {
        if (students.isEmpty()) {
            view.displayMessage("No students available.");
        } else {
            students.sort(Comparator.comparingInt(Student::getYearOfAdmission)); // Sorting by year of admission
            view.displayMessage("# - ID - Fullname - Phone number - Year of birth - Major - Year of admission - Entrance English score");
            for (Student student : students) {
                student.printInfo();
            }
        }
    }

    private void managePersons() {
        int personChoice;
        do {
            personChoice = view.displayPersonMenu();
            switch (personChoice) {
                case 1:
                    searchPersonByName();
                    break;
                case 2:
                    printAllPeople();
                    break;
                case 3:
                    view.displayMessage("Exiting Person Management...");
                    break;
                default:
                    view.displayMessage("Invalid choice. Try again.");
            }
        } while (personChoice != 3);
    }

    private void searchPersonByName() {
        String name = view.inputSearchName();
        boolean found = false;
        for (Person person : teachers) {
            if (person.getFullName().equalsIgnoreCase(name)) {
                person.printInfo();
                found = true;
            }
        }
        for (Person person : students) {
            if (person.getFullName().equalsIgnoreCase(name)) {
                person.printInfo();
                found = true;
            }
        }
        if (!found) {
            view.displayMessage("Result: not found");
        }
    }

    private void printAllPeople() {
        if (teachers.isEmpty() && students.isEmpty()) {
            view.displayMessage("No persons available.");
        } else {
            view.displayMessage("# - ID - Fullname - Phone number - Year of birth - Major");
            for (Teacher teacher : teachers) {
                teacher.printInfo();
            }
            for (Student student : students) {
                student.printInfo();
            }
        }
    }
}
