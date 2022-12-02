public class WorkerHour implements Salary {

    public void salary(String name, double pay, int hour) {
        System.out.println(name + " за " + hour + " годин роботи отримує зарплатню " + pay * hour + "$");
    }
}
