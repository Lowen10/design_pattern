# 单例模式

确保一个类只有一个实例，且提供全局访问点。 

### 懒汉模式（线程不安全）

Lazy初始化：是  
线程安全: 否

```java
public class LazySingleton {
     private static LazySingleton mInstance;
 
     private LazySingleton() {
     }
 
     public static LazySingleton getInstance() {
         if (mInstance == null) {
             mInstance = new LazySingleton();
         }
         return mInstance;
     }
 }
```

### 懒汉式（线程安全）

Lazy初始化：是  
线程安全: 是

```java
public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton mInstance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (mInstance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (mInstance == null) {
                    mInstance = new ThreadSafeSingleton();
                }
            }
        }
        return mInstance;
    }
}
```

### 饿汉模式

Lazy初始化：否  
线程安全: 是

```java
public class HungrySingleton {
    private static HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
```

### 登记式/静态内部类单例

Lazy初始化：是  
线程安全: 是

```java
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
```
