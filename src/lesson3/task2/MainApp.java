package lesson3.task2;

public class MainApp {

    public static void main(String[] args) {
        MultiThreadsCounter multiThreadsCounter = new MultiThreadsCounter();
        new ConcurrencyLock(multiThreadsCounter, "Thread-1");
        new ConcurrencyLock(multiThreadsCounter, "Thread-2");

    }
}
