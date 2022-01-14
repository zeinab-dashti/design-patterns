package CreationalDesignPattern.factory;

public class Strategy {
    private Do d;

    public Strategy(Do d){
        this.d = d;
    }

    public void doAction(String s){
        d.doSomething(s);
    }
}
