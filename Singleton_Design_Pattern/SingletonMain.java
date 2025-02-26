package Singleton_Design_Pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonMain 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        System.out.println("---Basic Singleton Example---");
        SingletonBasic instance1 = SingletonBasic.getInstance();
        SingletonBasic instance2 = SingletonBasic.getInstance();

        System.out.println("Hash code of instance1: " + instance1.hashCode());
        System.out.println("Hash code of instance2: " + instance2.hashCode());


        System.out.println("---ThreadSafe Singleton Example---");
        SingletonThreadSafe threadSafeInstance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe threadSafeInstance2 = SingletonThreadSafe.getInstance();

        System.out.println("Hash code of instance1: " + threadSafeInstance1.hashCode());
        System.out.println("Hash code of instance2: " + threadSafeInstance2.hashCode());

        System.out.println("---Serialization Safe Singleton Example---");
        SingletonSerializationSafe singletonSerializationSafeInstance = SingletonSerializationSafe.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton_instance.json"));
        objectOutputStream.writeObject(singletonSerializationSafeInstance);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton_instance.json"));
        SingletonSerializationSafe deSerializedSingletonInstance = (SingletonSerializationSafe) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Hash code of instance1: " + singletonSerializationSafeInstance.hashCode());
        System.out.println("Hash code of instance2: " + deSerializedSingletonInstance.hashCode());

    }
}
