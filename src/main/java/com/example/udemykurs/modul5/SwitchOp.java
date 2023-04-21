package com.example.udemykurs.modul5;

import java.util.Scanner;

public class SwitchOp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int monthNum = scanner.nextInt();

        switch (monthNum){
            case 3,4,5:
                System.out.println("Wiosna");
                break;
            case 6,7,8:
                System.out.println("Lato");
                break;
            case 9, 10, 11:
                System.out.println("Jesień");
                break;
            case 12, 1, 2:
                System.out.println("Zima");
                break;
            default:
                System.out.println("Nie ma takiego miesiaca");
        }

    }
}
