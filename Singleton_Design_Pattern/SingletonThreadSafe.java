package Singleton_Design_Pattern;

public class SingletonThreadSafe 
{
    
    public static volatile SingletonThreadSafe threadSafeInstance;

    private SingletonThreadSafe() {}

    public static SingletonThreadSafe getInstance() 
    {
        if (threadSafeInstance == null)
        {
            synchronized (SingletonThreadSafe.class) 
            {
                if (threadSafeInstance == null)
                {
                    threadSafeInstance = new SingletonThreadSafe();
                }
            }
        }
        return threadSafeInstance;
    }
}
