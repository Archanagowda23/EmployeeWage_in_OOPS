package com.bridgelabz.employeewage;

public class EmpWageMultiCompanies {

    //cConstant
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    //Instance variables
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    //Constructor
    public EmpWageMultiCompanies(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public static void main(String[] args) {
        EmpWageMultiCompanies zomato = new EmpWageMultiCompanies("zomato", 20, 3, 10);
        EmpWageMultiCompanies swiggy = new EmpWageMultiCompanies("swiggy", 15, 2, 12);
        EmpWageMultiCompanies dominoz = new EmpWageMultiCompanies("dominoz", 10, 3, 14);
        zomato.computeEmpWage();
        swiggy.computeEmpWage();
        dominoz.computeEmpWage();
    }

    private void computeEmpWage() {
        System.out.println("-----------------Welcome To Employee Wage Computation " + company + "-----------------");
        // Variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        // Computation
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays <= numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + ": Emp Hrs: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for " + company + " is " + totalEmpWage + ".");
    }
}
