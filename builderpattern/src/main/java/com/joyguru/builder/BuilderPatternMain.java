package com.joyguru.builder;

public class BuilderPatternMain
{
    public static void main(String[] args) {

        Form form = new Form
                .FormBuilder("projjalkundu", "projjalkundu")
                .setBirthdate("1993-11-16")
                .setHeight(64)
                .setWeight(57)
                .setNickname("kundukant")
                .build();

        System.out.println(form);
    }
}