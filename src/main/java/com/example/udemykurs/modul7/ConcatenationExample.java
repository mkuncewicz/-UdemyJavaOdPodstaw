package com.example.udemykurs.modul7;

public class ConcatenationExample {
    public static void main(String[] args) {


        String s1 = "Hello ";
        String s2 = "World";
        String s3 = s1 + s2 +"!";
        System.out.println(s3);

        String txt1 = "Test ";
        int number = 3212;

        String result = txt1 + number;
        System.out.println(result);

        String result2 = txt1.concat(Integer.toString(number));

        System.out.println(result2);
    }
}
