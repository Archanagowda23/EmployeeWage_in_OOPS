package com.bridgelabz.employeewage;

public class EmpWageOops {

    //cConstant
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    //Instance variables
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private  int totalEmpWage;

    //Constructor
    public EmpWageOops(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }


    private void computeEmpWage() {
        System.out.println("-----------------Welcome To Employee Wage Computation " + company + "-----------------");
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day : " + totalWorkingDays + "Emp Hr: " +empHrs);

        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }
    @Override
    public String toString() {
        return "Total Emp Wage for Company : " +company+" is: "+ totalEmpWage;
    }
    public static void main(String[] args) {
        EmpWageOops zomato = new EmpWageOops("zomato", 20, 3, 10);
        EmpWageOops swiggy = new EmpWageOops("swiggy", 15, 2, 12);
        EmpWageOops dominoz = new EmpWageOops("dominoz", 10, 3, 14);
        zomato.computeEmpWage();
        swiggy.computeEmpWage();
        dominoz.computeEmpWage();
    }
}
