package Singleton_Design_Pattern;


import java.io.Serializable;

public class SingletonSerializationSafe implements Serializable{

    public static volatile SingletonSerializationSafe singletonSerializationSafeInstance;

    private SingletonSerializationSafe() { }

    public static SingletonSerializationSafe getInstance() {
        if (singletonSerializationSafeInstance == null) {
            synchronized (SingletonSerializationSafe.class) {
                if (singletonSerializationSafeInstance == null) {
                    singletonSerializationSafeInstance = new SingletonSerializationSafe();
                }
            }
        }
        return singletonSerializationSafeInstance;
    }

    protected Object readResolve() {
        return singletonSerializationSafeInstance;
    }
    
}
