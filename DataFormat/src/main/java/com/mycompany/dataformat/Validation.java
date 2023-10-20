/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dataformat;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author conch
 */
public class Validation {
     public  String getValidPhone(Scanner scanner) {
        String phone;
        do {
            System.out.print("Enter Phone Number: ");
            phone = scanner.nextLine();
        } while (!isValidPhone(phone));
        return phone;
    }

    public  boolean isValidPhone(String phone) {
        if (!phone.matches("\\d+")) {
            System.out.println("Phone number must be a number.");
            return false;
        }
        if (phone.length() != 10) {
            System.out.println("Phone number must have 10 digits.");
            return false;
        }
        return true;
    }

    public  String getValidEmail(Scanner scanner) {
        String email;
        do {
            System.out.print("Enter Email: ");
            email = scanner.nextLine();
        } while (!isValidEmail(email));
        return email;
    }

    public  boolean isValidEmail(String email) {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            System.out.println("Email must be in the correct format.");
            return false;
        }
        return true;
    }

    public  String getValidDate(Scanner scanner) {
        String date;
        do {
            System.out.print("Enter Date (dd/MM/yyyy): ");
            date = scanner.nextLine();
        } while (!isValidDate(date));
        return date;
    }

    public  boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Disable lenient parsing

        try {
            sdf.parse(date);
        } catch (Exception e) {
            System.out.println("Date must be in the correct format (dd/MM/yyyy).");
            return false;
        }

        return true;
    }
}
