public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDnum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    };

    public double calculateWeeklyPay(double hoursWorked) {
        //code
        double hours = 0;
        double hoursOT;
        double totalWeeklyPay;

        if (hoursWorked > 40) {
            hoursOT = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            hoursWorked = 40;
            hours = hoursWorked * hourlyPayRate;
            totalWeeklyPay = hours + hoursOT;
            //return totalWeeklyPay;
        } else {
            totalWeeklyPay = hoursWorked * hourlyPayRate;
        }
        return totalWeeklyPay;
    }

    public String displayWeeklyPay(double hoursWorked) { //ignore this & line 36 comment, testing out format options - double totalWeeklyPay
        //code
        if (hoursWorked > 40) {
            System.out.println("Total regular hours: " + hoursWorked + "\nTotal regular pay: " + hoursWorked * hourlyPayRate);
            System.out.println("Total overtime hours: " + (hoursWorked - 40) + "\nTotal overtime pay: " + (hoursWorked - 40) * (hourlyPayRate * 1.5));
            System.out.println("Total hours: " + hoursWorked + "\nTotal Pay: " + calculateWeeklyPay(hoursWorked));
            //return String.format("Total regular hours: %f, Total regular pay: %f", hoursWorked, totalWeeklyPay);
        } else {
            System.out.println("Total Pay: " + calculateWeeklyPay(hoursWorked));
        }
        return "";
    }

}
