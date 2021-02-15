package lesson3.task1;

    public class Ping implements Runnable {
        private final PingPongQueue queue;

        public Ping(PingPongQueue queue) {
            this.queue = queue;
            new Thread(this, "Ping").start();
        }

        @Override
        public void run() {
            while (queue.getCounter() > 0) {
                try {
                    queue.printPing(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
