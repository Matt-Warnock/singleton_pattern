// only use if not multi-threading
public class BasicSingleton {
    private static BasicSingleton uniqueInstance;
    private BasicSingleton() {

    }

    public static BasicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BasicSingleton();
        }
        return uniqueInstance;
    }
}
