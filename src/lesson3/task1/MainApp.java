package lesson3.task1;

public class MainApp {

    public static void main(String[] args) {
        PingPongQueue queue = new PingPongQueue();
        new Ping(queue);
        new Pong(queue);
    }
}
