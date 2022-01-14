
package CreationalDesignPattern.singleton.lazy;

public class SingletonInstanceLazyThreadSafeBetterPerformance {
    private String s;
    private static volatile SingletonInstanceLazyThreadSafeBetterPerformance instanceLazy = null;

    private SingletonInstanceLazyThreadSafeBetterPerformance(){
        s = "Hello, this is CreationalDesignPattern.singleton instance-Lazy initialization";
    }

    public static SingletonInstanceLazyThreadSafeBetterPerformance getInstanceLazy(){
        if(instanceLazy==null)
            synchronized (SingletonInstanceLazyThreadSafeBetterPerformance.class) {
                if (instanceLazy == null)
                    instanceLazy = new SingletonInstanceLazyThreadSafeBetterPerformance();
            }
        return  instanceLazy;
    }
}

