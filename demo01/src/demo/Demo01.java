package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {

    public static void main(String[] args) {
        ExecutorService services = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 2; i++) {
            services.execute(new Task("name "+ i));
        }

        System.out.println("Finish at Main thread id=" + Thread.currentThread().getId());
    }

}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task name " + this.name);
    }
}
