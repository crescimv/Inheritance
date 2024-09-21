public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double annualSalary) {
        super(ID, firstName, lastName, title, YOB);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return (annualSalary / 52);
    }

    @Override
    public  String displayWeeklyPay(double hoursWorked) {
        return String.format("Total Pay per 1 week out of 52 weeks: " + calculateWeeklyPay(hoursWorked));
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + annualSalary;
    }

    @Override
    public String toXML() {
        return super.toXML().replace("</person>",
                "<annualSalary>" + annualSalary + "</annualSalary></person>");
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}",
                ",\"annualSalary\":" + annualSalary + "}");
    }
}
