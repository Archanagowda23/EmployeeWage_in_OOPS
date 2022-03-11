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

    public void PartTimeEmpWage(){
        int EmpWagePerHr = 20;
        int EmpHr = 8;
        int IsFullTime = 1;
        int IsPartTime = 2;
        int Salary = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IsFullTime) {
            Salary = (EmpHr * EmpWagePerHr);
            System.out.println("Employee salary for full time is: " + Salary);
        } else if (empCheck == IsPartTime) {
            EmpHr = 4;
            Salary = (EmpHr * EmpWagePerHr);
            System.out.println("Employee salary for part time is: " + Salary);
        } else
            System.out.println("Employee salary for absent is :" + Salary);

    }

    public void EmpWageSwitchCase(){
        int EmpWagePerHr = 20;
        int EmpHr = 8;
        int IsFullTime = 1;
        int IsPartTime = 2;
        int Salary = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case 0:
                EmpHr = 8;
                Salary = (EmpHr * EmpWagePerHr);
                System.out.println("Employee salary for full time is: " + Salary);
                break;

            case 1:
                EmpHr = 4;
                Salary = (EmpHr * EmpWagePerHr);
                System.out.println("Employee salary for part time is: " + Salary);
                break;

            case 2:
                EmpHr = 0;
                Salary = (EmpHr * EmpWagePerHr);
                System.out.println("Employee salary for Absent  is: " + Salary);
                break;
        }
    }


    public static void main(String[] args) {
        System.out.println("welcome to employee wage");
        EmployeeWage object = new EmployeeWage();

        object.EmployeeAttendance();
        object.CalculateDailyWage();
        object.PartTimeEmpWage();
        object.EmpWageSwitchCase();
    }
}
