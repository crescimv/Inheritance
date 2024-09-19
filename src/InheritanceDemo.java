import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        /* 1. Create 3 workers and 3 salaryWorker instances and add them to an ArrayList<Worker>.
        Pick reasonable hourly rates for the workers and reasonable salary rates for the
        salaryworkers.  Of course all workers have names, ids, and YOBs.

        2. Write a loop that simulates 3 weekly pay periods. Week 1 is a 40 hour week. For week 2
        assume it is crunch time and everyone worked 50 hours. Week 3 is back to normal with 40
        hours. Generate a display showing the weekly pay for each of the workers for each week
        in a reasonable tabular format.
*/
        ArrayList<Worker> workerArrayList = new ArrayList<Worker>();

        workerArrayList.add(new Worker("000001", "Spongebob", "Squarepants", "Mr.", 1986, 18.50));
        workerArrayList.add(new Worker("000002", "Patrick", "Star", "Mr.", 1988, 12.50));
        workerArrayList.add(new Worker("000003", "Squidward", "Tentacles", "Mr.", 1980, 20.00));
        workerArrayList.add(new SalaryWorker("000004", "Mr.", "Krabs", "Mr.", 1950, 240, 500000));
        workerArrayList.add(new SalaryWorker("000005", "Plankton", "Plankton", "Mr.", 1975, 48, 100000));
        workerArrayList.add(new SalaryWorker("000006", "Gary", "Snail", "Mr.", 2000, 9, 20000));

    }
}