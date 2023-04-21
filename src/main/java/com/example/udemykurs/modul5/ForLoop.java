package com.example.udemykurs.modul5;

public class ForLoop {
    public static void main(String[] args) {


        String[] names = {"Marek", "Mirek", "Jurek", "Krzysiek", "Jacek"};

        System.out.println("Od poczatku:");
        for (int i = 0; i < names.length; i++){
            System.out.println("Nr." + i + " -"+names[i]);
        }

        System.out.println("\n\n\n" + "Od konca:");
        for (int i = (names.length-1); i >= 0; i--){
            System.out.println("Nr." + i + " -"+names[i]);
        }
    }
}
