/*
* 经典的单件模式实现
*
* uniqueInstance是一个静态变量，只拥有一个实例
* 如果uniqueInstance是空，表示还没有创建实例，利用私有的构造器产生一个实例并把它赋值到uniqueInstance静态变量中。
* 请注意，如果我们不需要这个实例，它就永远不会产生，这就是“延迟实例化”。
* 如果uniqueInstance不是null，就表示之前已经创建过对象，会直接调到return语句。
* 当执行到return，表示已经有了实例，并将uniqueInstance当返回值。
* */

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
