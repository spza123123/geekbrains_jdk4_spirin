import java.util.ArrayList;
import java.util.List;

public class WorkerList {
    private static List<Worker> workerList = new ArrayList<>();

    public static List<Worker> findByExperience(int experience) {
        List<Worker> result = new ArrayList<>();
        for (Worker worker : workerList) {
            if (worker.getExperience() == experience) {
                result.add(worker);
            }
        }
        return result;
    }

    public void addNewWorker(Worker newWorker) {
        for (Worker worker : workerList) {
            if (worker == newWorker) {
                System.out.println("Worker " + newWorker.getName() + " with ID " + newWorker.getId() + " already exists in the list.");
                return;
            }
        }
        workerList.add(newWorker);
    }

    public List<Worker> findByNumber(String number) {
        List<Worker> result = new ArrayList<>();
        for (Worker worker : workerList) {
            if (worker.getPhoneNumber().equals(number)) {
                result.add(worker);
            }
        }
        return result;
    }

    public List<Worker> findById(int id) {
        List<Worker> result = new ArrayList<>();
        for (Worker worker : workerList) {
            if (worker.getId() == id) {
                result.add(worker);
            }
        }
        return result;
    }
}
