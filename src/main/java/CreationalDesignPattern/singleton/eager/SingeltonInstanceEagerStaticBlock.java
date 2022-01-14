package CreationalDesignPattern.singleton.eager;

public class SingeltonInstanceEagerStaticBlock {
    private static SingeltonInstanceEagerStaticBlock instanceEagerStaticBlock;
    private SingeltonInstanceEagerStaticBlock(){}
    static {
        try{
            instanceEagerStaticBlock = new SingeltonInstanceEagerStaticBlock();
        }catch (Exception e) {
            System.out.println("Exception happened");
        }
    }

    public static SingeltonInstanceEagerStaticBlock getInstance(){
        return instanceEagerStaticBlock;
    }
}
