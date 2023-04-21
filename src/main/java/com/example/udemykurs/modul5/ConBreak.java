package com.example.udemykurs.modul5;

public class ConBreak {
    public static void main(String[] args) {
        System.out.println("Break");
        for(int i = 0; i <= 50; i++){
            System.out.println(i);
            if(i == 10) break;
        }
        System.out.println("\n Contunue");
        for (int i = 0; i<= 50; i++){
            if(i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
