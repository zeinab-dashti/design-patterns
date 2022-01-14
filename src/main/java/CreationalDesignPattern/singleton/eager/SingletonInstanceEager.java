
package CreationalDesignPattern.singleton.eager;

public class SingletonInstanceEager {
    private String s;
    private static final SingletonInstanceEager instanceEager = new SingletonInstanceEager();

    private SingletonInstanceEager(){
        s = "Hello, This is CreationalDesignPattern.singleton example-Eager initialization";
    }

    public static SingletonInstanceEager getInstanceEager(){
        return instanceEager;
    }
}

