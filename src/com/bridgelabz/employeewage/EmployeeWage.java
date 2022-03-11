package com.bridgelabz.employeewage;

import java.util.Scanner;

public class EmployeeWage {

    public void EmployeeAttendance(){
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }

    public void CalculateDailyWage(){
        System.out.println("Enter numbers of hours worked");
        Scanner scanner = new Scanner(System.in);
        double totalHoursWorked = scanner.nextInt();
        double standardWages = 20;
        int standardHours = 8;
        double totalWage;
        if (totalHoursWorked > 8) {
            totalWage = (standardHours * totalHoursWorked) + (totalHoursWorked - standardHours);
        } else if (totalHoursWorked < 8) {
            totalWage = standardWages * totalHoursWorked;
        } else {
            totalWage = standardWages * standardHours;
        }
        System.out.println("MY total wages of full day is:" + totalWage);

    }

    public static void main(String[] args) {
        System.out.println("welcome to employee wage");
        EmployeeWage object = new EmployeeWage();

        object.EmployeeAttendance();
        object.CalculateDailyWage();
    }
}
