package CreationalDesignPattern.factory;

public class DoImplV2 implements Do {
    public DoImplV2() {
    }

    @Override
    public void doSomething(String s) {
        System.out.println("I am v2 and I got this: " +s);
    }
}
