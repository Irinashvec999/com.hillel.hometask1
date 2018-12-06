package com.hillel.hometask16;

import com.hillel.Utils.Swap;

public class ManagementDepartment {
    private final int TOTAL_COUNT = 15;
    private Employee[] employees = new Employee[TOTAL_COUNT];
    private int count;

    public void add(Employee employee) {
        employees[count] = employee;
        count++;

    }

    public Employee[] filterFemaleGender(Gender gender) {
        int countFemale = 0;
        Employee[] female = new Employee[countFemale];
        for (Employee e : employees) {
            if (e.getGender() == gender.female) {
                countFemale++;
                female[countFemale] = e;
            }
        }
        return female;
    }

    public Employee[] filterOlder(int age) {
        int currentYear = 2008;
        int setYear = currentYear - age;
        int counterOlderPerson = 0;
        Employee[] olderEmloyees = new Employee[counterOlderPerson];
        for (Employee e : employees) {
            if (e.getYear() > setYear) {
                counterOlderPerson++;
                olderEmloyees[counterOlderPerson] = e;
            }
        }
        return olderEmloyees;
    }

    public Employee[] filterYounger(int age) {
        int currentYear = 2008;
        int setYear = currentYear - age;
        int counterYoungerPerson = 0;
        Employee[] youngerEmployees = new Employee[counterYoungerPerson];
        for (Employee e : employees) {
            if (e.getYear() > setYear) {
                counterYoungerPerson++;
                youngerEmployees[counterYoungerPerson] = e;
            }
        }
        return youngerEmployees;
    }
}


