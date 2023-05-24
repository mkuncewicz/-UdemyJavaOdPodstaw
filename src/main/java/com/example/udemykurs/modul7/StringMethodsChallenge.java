package com.example.udemykurs.modul7;

public class StringMethodsChallenge {
    public static void main(String[] args) {


        String text =  "Ola ma kota. ".repeat(3);
        text = text.replaceAll("Ola","Kasia");
        text = text.replaceFirst("Kasia","Monika");
        int firstIndex = text.indexOf("Kasia");
        int lastIndex = text.lastIndexOf("Kasia");
        System.out.println(text);
        System.out.println("First Index: " + firstIndex);
        System.out.println("Last Index: " + lastIndex);
        text = text.substring(firstIndex);
        System.out.println(text);
    }
}
