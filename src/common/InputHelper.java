/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

public class InputHelper {
    private static Scanner scanner = new Scanner(System.in);

    // Hàm kiểm tra ID 6 chữ số
    public static String inputID(String prompt) {
        String id;
        while (true) {
            System.out.print(prompt);
            id = scanner.nextLine();
            if (id.matches("\\d{6}")) {
                return id;
            } else {
                System.out.println("Data input is invalid");
            }
        }
    }

    // Nhập chuỗi chỉ chứa chữ cái và khoảng trắng
    public static String inputFullName(String prompt) {
        String fullName;
        while (true) {
            System.out.print(prompt);
            fullName = scanner.nextLine();
            if (fullName.matches("[a-zA-Z ]+")) {
                return fullName;
            } else {
                System.out.println("Data input is invalid");
            }
        }
    }

    // Nhập số điện thoại, kiểm tra độ dài chính xác
    public static String inputPhoneNumber(String prompt) {
        String phoneNumber;
        while (true) {
            System.out.print(prompt);
            phoneNumber = scanner.nextLine();
            if (phoneNumber.matches("\\d{12}")) {
                return phoneNumber;
            } else {
                System.out.println("Phone number must be exactly 12 digits.");
            }
        }
    }

    // Nhập số nguyên với khoảng giá trị xác định
    public static int inputInt(String prompt, int min, int max) {
        int number;
        while (true) {
            System.out.print(prompt);
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println("Input must be between " + min + " and " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer.");
            }
        }
    }

    // Nhập chuỗi với giới hạn độ dài
    public static String inputString(String prompt, int maxLength) {
        String result;
        while (true) {
            System.out.print(prompt);
            result = scanner.nextLine();
            if (result.length() <= maxLength) {
                return result;
            } else {
                System.out.println("Input must be no longer than " + maxLength + " characters.");
            }
        }
    }
}
