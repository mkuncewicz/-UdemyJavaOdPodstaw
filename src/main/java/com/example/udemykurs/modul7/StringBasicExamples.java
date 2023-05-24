package com.example.udemykurs.modul7;

import java.util.ArrayList;

public class StringBasicExamples {
    public static void main(String[] args) {

        String s1 = "COSTAM";
        String s2 = new String("String passed to contructor");
        String s3 = "test ".repeat(3);

        System.out.println(s3);

        String s4 = String.join(".","One","Two","Three");

        System.out.println(s4);

        ArrayList<String> list = new ArrayList<>();
        list.add("Mateusz");
        list.add("Kamil");
        list.add("Grzesiu");

        String s5 = String.join(",",list);
        System.out.println("\n\n"+s5);

        char arr[] = {'O','L','A'};
        String s6 = new String(arr);
        System.out.println(s6);
    }
}
