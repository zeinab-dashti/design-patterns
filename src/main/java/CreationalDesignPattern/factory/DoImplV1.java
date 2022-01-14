package CreationalDesignPattern.factory;

public class DoImplV1 implements Do {
    public DoImplV1() {
    }

    @Override
    public void doSomething(String s) {
        System.out.println("I am V1 and I got this: " +s);
    }
}
