package lesson3.task1;


public class Pong implements Runnable {
    private final PingPongQueue queue;

    public Pong(PingPongQueue queue) {
        this.queue = queue;
        new Thread(this, "Pong").start();
    }


    @Override
    public void run() {
        while (queue.getCounter() > 0) {
            try {
                queue.printPong(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}