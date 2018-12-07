package com.hillel.hometask16;

public class Starter {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan",1990,15025.5,Gender.male);
        Employee employee2 = new Employee("Todorova Vera",1992,25125.8,Gender.female);
        Employee employee3 = new Employee("Bogdanova Victoria",1990,48536.8,Gender.female);
        Employee employee4 = new Employee("Morozov Victor",1989,68500.6,Gender.male);
        Employee employee5 = new Employee("Ovchar Oleg",1986,89562.3,Gender.male);
        Employee employee6 = new Employee("Morozova Olga",1990,10400.4,Gender.female);
        Employee employee7 = new Employee("Riz Edgar",1989,98456.2,Gender.male);

        ManagementDepartment managementDepartment = new ManagementDepartment();
        managementDepartment.add(employee1);
        managementDepartment.add(employee2);
        managementDepartment.add(employee3);
        managementDepartment.add(employee4);
        managementDepartment.add(employee5);
        managementDepartment.add(employee6);
        managementDepartment.add(employee7);

        System.out.println("Female employees: ");
        ManagementDepartment.showAllGenderSortEmpl(managementDepartment);
        System.out.println();
        System.out.println("Employees older than 28 year: ");
        ManagementDepartment.showAllOlderEmpl(managementDepartment);
        System.out.println();
        System.out.println("Employees younger than 28 year: ");
        ManagementDepartment.showAllYoungerEmpl(managementDepartment);



    }
}
