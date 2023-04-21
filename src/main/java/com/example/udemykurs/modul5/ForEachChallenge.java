package com.example.udemykurs.modul5;

public class ForEachChallenge {
    public static void main(String[] args) {

        int[] numbers = {34,54,12,32,65};
        int result = 0;
        for (int number : numbers){
            result += number;
        }
        System.out.println(result);
    }
}
