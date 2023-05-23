package com.example.lab9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GaloubI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите GUID: ");
        String date = scanner.nextLine();

        String regex = "^[{(]?[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}[})]?$";

        boolean isValid = Pattern.matches(regex, date);

        if (isValid) {
            System.out.println("GUID  is valid.");
        } else {
            System.out.println("GUID  is not valid.");
        }

    }

}
