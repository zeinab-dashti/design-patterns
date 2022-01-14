
package CreationalDesignPattern.singleton;

import CreationalDesignPattern.singleton.eager.SingletonInstanceEager;
import CreationalDesignPattern.singleton.lazy.SingletonInstanceLazy;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonInstanceLazy x = SingletonInstanceLazy.getInstanceLazy();
        SingletonInstanceLazy y = SingletonInstanceLazy.getInstanceLazy();
        System.out.println(x==y);

        SingletonInstanceEager z = SingletonInstanceEager.getInstanceEager();
        SingletonInstanceEager w = SingletonInstanceEager.getInstanceEager();
        System.out.println(z==w);


        /*SingletonInstanceLazy x = SingletonInstanceLazy.getInstanceLazy();
        SingletonInstanceLazy y = SingletonInstanceLazy.getInstanceLazy();

        System.out.println(x.s);        x.s = (x.s).toUpperCase();        System.out.println(y.s);
        SingletonInstanceEager z = SingletonInstanceEager.getInstanceEager();
        SingletonInstanceEager w = SingletonInstanceEager.getInstanceEager();

        System.out.println(z.s);        z.s = (z.s).toUpperCase();        System.out.println(w.s);*/

    }
}

