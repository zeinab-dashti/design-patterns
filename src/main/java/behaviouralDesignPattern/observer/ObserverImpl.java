package behaviouralDesignPattern.observer;

import lombok.Data;

@Data
public class ObserverImpl implements Observer{
    private String name;
    private Publisher publisher;

    public ObserverImpl(String name) {
        this.name = name;
        System.out.println("I'm observer: "+ name);
    }

    @Override
    public void isUpdateReadyForObserver(String message) {
        if(message == null)
            System.out.println(name+":: No new message");
        else
            System.out.println(this.getName() + " get message: " + message);
    }

    @Override
    public void setPublisherForObserver(PublisherImpl publisherImpl){
        System.out.println(this.name + " register to: " + publisherImpl.getName());
        this.publisher = publisherImpl;
        publisherImpl.register(this);
    }
   /* @Override
    public void unRegisterFromPublisher(PublisherImpl publisherImpl){
        System.out.println(this.name + " unRegister to " + publisherImpl.getName());
        publisherImpl.unRegister(this);
    }*/

}
