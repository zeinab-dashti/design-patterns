
package CreationalDesignPattern.singleton.lazy;

public class SingletonInstanceLazy {
    private String s;
    private static volatile SingletonInstanceLazy instanceLazy = null;

    private SingletonInstanceLazy(){
        s = "Hello, this is CreationalDesignPattern.singleton instance-Lazy initialization";
    }

    public static SingletonInstanceLazy getInstanceLazy(){
        if(instanceLazy==null)
            instanceLazy = new SingletonInstanceLazy();
        return instanceLazy;
    }
}

