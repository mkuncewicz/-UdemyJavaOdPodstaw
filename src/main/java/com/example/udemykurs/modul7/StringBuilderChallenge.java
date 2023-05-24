package com.example.udemykurs.modul7;

public class StringBuilderChallenge {
    public static void main(String[] args) {

        String[] list = {"Marek","Jurek","Mateusz","Julia","Kasia"};
        StringBuilder builder = new StringBuilder();
        for (String name : list){
            builder.append(name + " ");
        }
        System.out.println(builder);

    }
}
