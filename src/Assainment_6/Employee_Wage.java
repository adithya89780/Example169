package Assainment_6;

public class Employee_Wage {
        static final int WAGE_PER_HOUR=20;
        static final int FULL_DAY_HOUR=8;
        static final int PART_TIME_HOUR=4;
        static final int IS_PART_TIME=1;
        static final int IS_FULL_TIME=2;
        static final int  TOTAL_WORKING_HOURS=100;
        static final int TOTAL_WORKING_DAYS=20;

        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage !");
            int day=1;
            int workingHours=0;
            int totalWage=0;

            while(day < TOTAL_WORKING_DAYS && workingHours <= TOTAL_WORKING_HOURS) {
                int empRandom = (int) Math.floor(Math.random() * 10) % 3;
                int dailyWage = 0;

                switch (empRandom) {
                    case IS_FULL_TIME:
                        System.out.println("Employee is Present !");
                        dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                        workingHours+=FULL_DAY_HOUR;
                        break;

                    case IS_PART_TIME:
                        System.out.println("Employee works Part-time!!");
                        dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                        workingHours+=PART_TIME_HOUR;
                        break;

                    default:
                        System.out.println("Employee is Absent!!");

                }
                totalWage+=dailyWage;
                System.out.println("Employee Daily Wage = Rs. " + dailyWage);
                day++;
            }

            System.out.println("Total Hours Worked: "+workingHours);
            System.out.println("Total Days Worked: "+day);
            System.out.println("Employee Monthly Wage = Rs. "+ totalWage);
        }
    }