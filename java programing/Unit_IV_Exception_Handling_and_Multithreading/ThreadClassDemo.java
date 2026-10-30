class GreetingThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from the new thread.");
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new GreetingThread();
        thread.start();
        thread.join();
        System.out.println("Main thread ends.");
    }
}
