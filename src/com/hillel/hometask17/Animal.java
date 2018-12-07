package com.hillel.hometask17;

public abstract class Animal {
    public enum Name{FISH,DOG,CAT,WOLF,LION}
    public enum Color {BLACK,WHITE,BLUE,RED,YELLOW,PURPLE,GREEN,GRAY,BROWN,PINK,ORANGE}
    public  enum Domestication{WILD,DOMESTIC}
    public enum IsPredator {PREDATOR,NOTPREDATOR}

    private static Name name;
    private Color color;
    private int age;
    private double weight;
    private static IsPredator isPredator;
    private static Domestication domestication;

    public Animal(Name name, Color color, int age, double weight,Domestication domestication, IsPredator isPredator) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.domestication = domestication;
        this.isPredator = isPredator;
    }


    public static Name getName() {
        return name;
    }

    public static Domestication getDomestication() {
        return domestication;
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public static IsPredator getIsPredator() {
        return isPredator;
    }

    public abstract void say();
}
