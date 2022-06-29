package designPaterns.singleton;

public class Singleton {
    private static Singleton instance;
    public static int nrOfInstances;

    private Singleton() {
        System.out.println("Din constr privat Singleton");
        nrOfInstances++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized ((Singleton.class)) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}
