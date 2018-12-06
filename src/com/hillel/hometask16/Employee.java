package com.hillel.hometask16;

public class Employee {
    private String name;
    private int year;
    private double salary;
    private Gender gender;

    public Employee(String name, int year, double salary, Gender gender) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public Gender getGender() {
        return gender;
    }

}
