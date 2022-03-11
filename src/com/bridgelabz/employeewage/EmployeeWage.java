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
    public void EmpSalary(){
        int IsFullTime = 2;
        int IsPartTime = 1;
        int PerHourSalary = 20;
        int workingHour =0;
        int totalSalary = 0;
        int Salary;

        for (int day = 1; day <= 20; day++)
        {
            int empCheck = (int) Math.floor(Math.random() * 10) % 2;
            switch (empCheck)
            {

                case 0:
                    workingHour = 8;
                    break;

                case 1:
                    workingHour = 4;
                    break;

                case 2:
                    workingHour = 0;
                    break;
            }
            Salary =workingHour * PerHourSalary ;
            totalSalary = totalSalary + Salary;

        }
        System.out.println("Employee has earned total salary in a month is: " + totalSalary);

    }
    public void EmpMaxSalary()
    {
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EmpRatePerHr = 20;
        int Max_Salary = 100;
        int WorkingHour = 0;
        int TotalSalary = 0;
        int Salary;
        int TotalWorkingDays = 0;
        int NumOfWorkingDays = 20;
        int empHrs =0;

        while (WorkingHour <= Max_Salary && TotalWorkingDays < NumOfWorkingDays)
        {
            TotalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch(empCheck)
            {
                case 0:
                    empHrs = 8;
                    break;

                case 1:
                    empHrs = 4;
                    break;

                case 2:
                    empHrs = 0;
                    break;
            }
            WorkingHour += empHrs;
            System.out.println("Day#: " + TotalWorkingDays + " Emp Hr " + empHrs );
        }
        int totalEmpWage = WorkingHour * EmpRatePerHr;
        System.out.println("total Emp Wage " + totalEmpWage);

    }

    public static void main(String[] args) {
        System.out.println("welcome to employee wage");
        EmployeeWage object = new EmployeeWage();

        object.EmployeeAttendance();
        object.CalculateDailyWage();
        object.PartTimeEmpWage();
        object.EmpWageSwitchCase();
        object.EmpSalary();
        object.EmpMaxSalary();
    }
}
