package behaviouralDesignPattern.observer;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class PublisherImpl implements Publisher{

    private String name;
    private String message;
    List<Observer> observerList = new ArrayList<>();

    public PublisherImpl(String name) {
        this.name = name;
        System.out.println("I'm publisher: "+ name);
    }

    @Override
    public void register(Observer observer){
        observerList.add(observer);
    }

    @Override
    public void unRegister(Observer observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message){
        for(Observer observer : observerList)
            observer.isUpdateReadyForObserver(message);
    }

    public void postMessage(String message){
        this.message = message;
        notifyObservers(message);
    }

}
