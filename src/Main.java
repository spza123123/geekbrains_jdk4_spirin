public class Main {
    public static void main(String[] args) {
        WorkerList list = new WorkerList();
        Worker worker1 = new Worker(0, "123", "Alex", 12);
        Worker worker3 = new Worker(1, "444", "Alexander", 9);
        Worker worker2 = new Worker(2, "987", "Alexander", 9);
        Worker worker4 = new Worker(3, "987", "Davon", 1);

        list.addNewWorker(worker1);
        list.addNewWorker(worker2);
        list.addNewWorker(worker3);
        list.addNewWorker(worker4);
        list.addNewWorker(worker4);

        System.out.println();

        System.out.println(list.findByNumber("987"));
        System.out.println();
        System.out.println(list.findById(0));


    }
}
