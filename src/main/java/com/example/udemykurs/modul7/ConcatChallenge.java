package com.example.udemykurs.modul7;

public class ConcatChallenge {
    public static void main(String[] args) {

        String tab[] = {"Mateusz","Marysia","Julia","Krzysiu"};

        String str1 = String.join(", ", tab);

        System.out.println(str1);
    }
}
