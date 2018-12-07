package com.hillel.hometask17;

public class Beast extends Animal {

    public Beast(Name name, Color color, int age, double weight, Domestication domestication, IsPredator isPredator) {
        super(name, color, age, weight, domestication, isPredator);
    }

    @Override
    public void say() {
        System.out.println("Hello, " +" my name is " + Animal.getName());
        switch (Animal.getName()) {
            case DOG:
                System.out.println("Rex...woof...woof");
                break;
            case CAT:
                System.out.println("Pushok...meow");
                break;
            case WOLF:
                System.out.println("Akela...");
                break;
            case FISH:
                System.out.println(".....");
                break;
            case LION:
                System.out.println("King...rrrr");
                break;
        }
                switch (Animal.getDomestication()){
                    case WILD:
                        System.out.println("I am a wild animal");
                        break;
                }
                switch (Animal.getIsPredator()){
                    case PREDATOR:
                        System.out.println("...and I am angry");
                        break;
        }

    }
}
