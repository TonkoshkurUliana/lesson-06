import com.lgs.lab.interface2.MyCalculator;

public class Main {

    public static void main(String[] args) {
        System.out.println("*********** Task1 ***********");
        WorkerHour workerHour = new WorkerHour();
        workerHour.salary("James", 5.6, 8);
        WorkerMonth workerMonth = new WorkerMonth();
        workerMonth.salary("Tom", 567);
        System.out.println("");
        System.out.println("*********** Task2 ***********");
        MyCalculator.plus(3, 4);
        MyCalculator.minus(6, 4);
        MyCalculator.multi(6, 2);
        MyCalculator.dev(66, 3);
    }
}