
package CreationalDesignPattern.singleton.lazy;

public class SingletonInstanceLazyThreadSafe {
    private String s;
    private static volatile SingletonInstanceLazyThreadSafe instanceLazy = null;

    private SingletonInstanceLazyThreadSafe(){
        s = "Hello, this is CreationalDesignPattern.singleton instance-Lazy initialization";
    }

    public static synchronized SingletonInstanceLazyThreadSafe getInstanceLazy(){
        if(instanceLazy==null)
            instanceLazy = new SingletonInstanceLazyThreadSafe();
        return  instanceLazy;
    }
}

