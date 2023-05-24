package com.example.udemykurs.modul7;

public class StringBuilderExample {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder();

        builder.append(" HELLO WORLD ");
        builder.append(1);
        System.out.println(builder);
        builder.insert(0,23);
        System.out.println(builder);
        builder.delete(0,3);
        System.out.println(builder);

        StringBuilder builder2 = new StringBuilder("Elo");

        System.out.println(builder2);

        builder2.delete(0,3);
        System.out.println(builder2);
        builder2.insert(0,"XYZ");
        System.out.println(builder2);
        builder2.replace(0,2,"YYYYY");
        System.out.println(builder2);
        builder2.replace(0,4,"XX");
        int index = builder2.indexOf("Y");
        System.out.println(builder2);
        System.out.println(index);
        builder2.delete(0,index);
        System.out.println(builder2);
        builder2.delete(0,builder2.length());
        System.out.println(builder2);
        System.out.println("Koniec");
    }
}
