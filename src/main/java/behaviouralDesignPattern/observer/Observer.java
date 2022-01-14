package behaviouralDesignPattern.observer;

public interface Observer {
    void isUpdateReadyForObserver(String message);
    void setPublisherForObserver(PublisherImpl publisher);
    //void deleteObserverFromPublisher(PublisherImpl publisher);
}
