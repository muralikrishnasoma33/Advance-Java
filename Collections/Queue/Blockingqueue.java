package Collections.Queue;

import java.util.concurrent.*;

public class Blockingqueue {
    public static void main(String[] args) {
        // Create BlockingQueue with capacity 3
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        // Producer thread - puts items
        new Thread(() -> {
            try {
                queue.put("A");
                System.out.println("Produced: A");

                queue.put("B");
                System.out.println("Produced: B");

                queue.put("C");
                System.out.println("Produced: C");
                
                // Now queue is full (3 items), next put() will wait
                queue.put("D");
                System.out.println("Produced: D");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Consumer thread - takes items
        new Thread(() -> {
            try {
                Thread.sleep(3000); // wait a bit
                System.out.println("Consumed: " + queue.take());
                Thread.sleep(1000);
                System.out.println("Consumed: " + queue.take());
                Thread.sleep(1000);
                System.out.println("Consumed: " + queue.take());
                Thread.sleep(1000);
                System.out.println("Consumed: " + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
