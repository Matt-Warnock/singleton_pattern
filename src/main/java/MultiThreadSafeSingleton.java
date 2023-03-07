// Doesn't work in Java 1.4 or earlier
public class MultiThreadSafeSingleton {
    private volatile static MultiThreadSafeSingleton uniqueInstance;
    private MultiThreadSafeSingleton() {

    }

    public static MultiThreadSafeSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (MultiThreadSafeSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new MultiThreadSafeSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
