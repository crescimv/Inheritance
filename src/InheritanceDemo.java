import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {

        ArrayList<Worker> workerArrayList = new ArrayList<>();

        workerArrayList.add(new Worker("000001", "Spongebob", "Squarepants", "Mr.", 1986, 18.50));
        workerArrayList.add(new Worker("000002", "Patrick", "Star", "Mr.", 1988, 12.50));
        workerArrayList.add(new Worker("000003", "Squidward", "Tentacles", "Mr.", 1980, 20.00));
        workerArrayList.add(new SalaryWorker("000004", "Mr.", "Krabs", "Mr.", 1950, 250000));
        workerArrayList.add(new SalaryWorker("000005", "Plankton", "Plankton", "Mr.", 1975, 100000));
        workerArrayList.add(new SalaryWorker("000006", "Gary", "Snail", "Mr.", 2000, 20000));

        int[] payPeriod = {40, 50, 40};
        for (int week = 1; week <= 3; week ++) {
            System.out.println("\nWeek: " + week + "    Hours worked: " + payPeriod[week-1]);
            System.out.println("-".repeat(30));
            System.out.printf("%-10s %-15s %-15s %-10s %-10s\n", "ID", "First Name", "Last Name", "Title", "Weekly Pay");
            System.out.println("-".repeat(65));
            for (Worker worker : workerArrayList) {
                double weeklyPay = worker.calculateWeeklyPay(payPeriod[week - 1]);
                System.out.printf("%-10s %-15s %-15s %-10s %-10.2f\n",
                        worker.getID(), worker.getFirstName(), worker.getLastName(), worker.getTitle(), weeklyPay);
            }
        }
    }
}