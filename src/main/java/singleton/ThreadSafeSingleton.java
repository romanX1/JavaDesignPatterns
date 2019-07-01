package singleton;

public final class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    public String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        ThreadSafeSingleton result = instance;
        if (result == null) {
            synchronized (ThreadSafeSingleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new ThreadSafeSingleton(value);
                }
            }
        }
        return instance;
    }
}
