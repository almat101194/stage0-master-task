package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String temp = hasFur ? "a" : "no";
        String paws = numberOfPaws > 1 ? "paws" : "paw";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + paws + " and " + temp + " fur.";
    }
}
