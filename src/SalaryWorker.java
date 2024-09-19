public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(IDnum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return (annualSalary / 52);
    }

    @Override
    public  String displayWeeklyPay(double hoursWorked) {
        String.format("Total Pay per 1 week out of 52 weeks): %.2f", calculateWeeklyPay(hoursWorked));
        return "";
    }
}
