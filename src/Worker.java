public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(String ID, String firstName, String lastName, String title, int YOB) {
        super(ID, firstName, lastName, title, YOB);
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        //code
        double regularPay;
        double overtimePay = 0;

        if (hoursWorked > 40) {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
        } else {
            regularPay = hoursWorked * hourlyPayRate;
        }
        return regularPay + overtimePay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        //code
        if (hoursWorked > 40) {
            System.out.println("Total regular hours: " + hoursWorked + "\nTotal regular pay: " + hoursWorked * hourlyPayRate);
            System.out.println("Total overtime hours: " + (hoursWorked - 40) + "\nTotal overtime pay: " + (hoursWorked - 40) * (hourlyPayRate * 1.5));
            System.out.println("Total hours: " + hoursWorked + "\nTotal Pay: " + calculateWeeklyPay(hoursWorked));
        } else {
            System.out.println("Total Pay: " + calculateWeeklyPay(hoursWorked));
        }
        return "";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + hourlyPayRate;
    }

    @Override
    public String toXML() {
        return super.toXML().replace("<person>", "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate></person>");
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}",
                ",\"hourlyPayRate\":" + hourlyPayRate + "}");
    }
}
