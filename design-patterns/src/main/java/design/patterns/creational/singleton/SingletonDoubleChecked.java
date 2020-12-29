package design.patterns.creational.singleton;

//Double Checked Locking based Java implementation of
//singleton design pattern
public class SingletonDoubleChecked
{
 private static volatile SingletonDoubleChecked obj  = null;

 private SingletonDoubleChecked() {}

 public static SingletonDoubleChecked getInstance()
 {
     if (obj == null)
     {
         // To make thread safe
         synchronized (SingletonDoubleChecked.class)
         {
             // check again as multiple threads
             // can reach above step
             if (obj==null)
                 obj = new SingletonDoubleChecked();
         }
     }
     return obj;
 }
}