package com.hillel.hometask16;

import java.util.Arrays;

public class ManagementDepartment {
    private final int TOTAL_COUNT = 15;
    private Employee[] employees = new Employee[TOTAL_COUNT];
    private int count;
    private int countGender;
    private Employee[] genderSortArr = new Employee[TOTAL_COUNT];
    private int counterOlderPerson;
    private Employee[] olderEmployees = new Employee[TOTAL_COUNT];
    private int counterYoungerPerson = 0;
    private Employee[] youngerEmployees = new Employee[TOTAL_COUNT];

    public ManagementDepartment() {
        Employee some = new Employee("0",0,0,Gender.unknown);
        Arrays.fill(employees,some);
    }

    public void add(Employee employee) {
        employees[count] = employee;
        count++;

    }


    public Employee[] filterGender(Gender gender) {
        for (Employee e : employees) {
            if (e.getGender() == gender) {
                genderSortArr[countGender] = e;
                countGender++;
            }
        }
        Employee[] genderSort = Arrays.copyOf(genderSortArr, countGender);
        return genderSort;
    }

    public Employee[] filterOlder(int age) {
        int currentYear = 2008;
        int setYear = currentYear - age;

        for (Employee e : employees) {
            if (e.getYear() > setYear) {
                olderEmployees[counterOlderPerson] = e;
                counterOlderPerson++;
            }
        }
        Employee [] olderArr = Arrays.copyOf(olderEmployees,counterOlderPerson);
        return olderArr;
    }

    public Employee[] filterYounger(int age) {
        int currentYear = 2008;
        int setYear = currentYear - age;

        for (Employee e : employees) {
            if (e.getYear() > setYear && e.getYear()!=0) {
                youngerEmployees[counterYoungerPerson] = e;
                counterYoungerPerson++;
            }
        }
        Employee[] youngerArr = Arrays.copyOf(youngerEmployees,counterYoungerPerson);
        return youngerArr;
    }
    public static void showAllGenderSortEmpl(ManagementDepartment managementDepartment) {
        for ( Employee e: managementDepartment.filterGender(Gender.female)) {
            System.out.println(e.getName() +" (" + e.getYear() + ") - salary (hrn) " + e.getSalary() + " - " + e.getGender());
        }
    }
    public static void showAllOlderEmpl(ManagementDepartment managementDepartment) {
        for ( Employee e: managementDepartment.filterOlder(28)) {
            System.out.println(e.getName() +" (" + e.getYear() + ") - salary (hrn) " + e.getSalary() + " - " + e.getGender());
        }
    }
    public static void showAllYoungerEmpl(ManagementDepartment managementDepartment) {
        for ( Employee e: managementDepartment.filterYounger(28)) {
            System.out.println(e.getName() +" (" + e.getYear() + ") - salary (hrn) " + e.getSalary() + " - " + e.getGender());
        }
    }
}


