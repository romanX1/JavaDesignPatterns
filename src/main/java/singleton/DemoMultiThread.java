package singleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {

        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("FOO");
            System.out.println(threadSafeSingleton.value);
        }
    }

    static class ThreadBar implements Runnable {

        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("BAR");
            System.out.println(threadSafeSingleton.value);
        }
    }
}