package com.hillel.hometask9;

public class Team {
    public static void main(String[] args) {
        int[] firstTeam = {25,19,23,21,25,26,24,28,29,26,17,18,19,31,21,32,34,38,21,22,26,25,26,28,29};
        int[] secondTeam = {24,23,28,29,24,27,35,36,34,26,34,26,25,35,27,32,34,30,32,36,28,29,27,25,26};
        int sumFirstTeam = 0;
        int sumSecondTeam = 0;

        for (int i:firstTeam) {
            sumFirstTeam = i + sumFirstTeam;
            System.out.print(i + ", ");
        }
        int averageFirst = sumFirstTeam/firstTeam.length;
        System.out.println();

        for (int i : secondTeam) {
            sumSecondTeam = i + sumSecondTeam;
            System.out.print(i + ", ");
        }
        int averageSecond = sumSecondTeam/secondTeam.length;
        System.out.println();

        if(averageFirst>averageSecond){
            System.out.println("The average age of first team is bigger than average age of second team");
        }else if(averageFirst<averageSecond){
            System.out.println("The average age of first team is smaller than average age of second team");
        }else {
            System.out.println("The average age of first team is the same than average age of second team");
        }
    }
}
