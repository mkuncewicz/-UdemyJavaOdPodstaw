package com.example.udemykurs.modul5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfinitiWhile {
    public static void main(String[] args) throws IOException {


        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("Wpisz liczbe lub quit");
            String data = br.readLine();
            if(data.equalsIgnoreCase("quit")) break;

            int num = Integer.parseInt(data);
            number += num;

            System.out.println("Result: " + number);
        }

    }
}
