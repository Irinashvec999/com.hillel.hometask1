package com.hillel.hometask17;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Beast(Animal.Type.WOLF,Animal.Name.AKELA, Animal.Color.GRAY,2,15D, Animal.Domestication.WILD, Animal.IsPredator.PREDATOR);
        animal.say();
    }
}
