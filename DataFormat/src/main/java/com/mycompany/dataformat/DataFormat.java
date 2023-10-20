/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dataformat;

import java.util.Scanner;

public class DataFormat {
    
    public static void main(String[] args) {
        Validation val = new Validation();
        Scanner scanner = new Scanner(System.in);
        String phone = val.getValidPhone(scanner);
        String email = val.getValidEmail(scanner);
        String date = val.getValidDate(scanner);

        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Date: " + date);
    }

   
}
