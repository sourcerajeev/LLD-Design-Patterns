package SingletonDesignPattern;

public class SingletonBasic 
{
    public static SingletonBasic instance;

    private SingletonBasic() {}

    public static SingletonBasic getInstance() 
    {
        if (instance == null) 
        {
            instance = new SingletonBasic();
        }
        return instance;
    }
}