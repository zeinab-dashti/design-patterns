package CreationalDesignPattern.factory;

public class ObjectFactoryImpl implements ObjectFactory {
    @Override
    public Do getObject(String type) {
        if(type.equals("V1")){
            return new DoImplV1();
        }else if(type.equals("V2")){
            return new DoImplV2();
        }
        return null;
    }
}
