package com.example.udemykurs.modul7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ChuckExample {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream inputStream = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            String line = null;
            while ( (line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
