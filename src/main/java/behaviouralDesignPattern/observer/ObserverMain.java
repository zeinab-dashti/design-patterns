package behaviouralDesignPattern.observer;

public class ObserverMain {
    public static void main(String[] args) {

		//create subject
		PublisherImpl publisher = new PublisherImpl("new publisher");

		Observer observer1 = new ObserverImpl("1");
		Observer observer2 = new ObserverImpl("2");

		observer1.setPublisherForObserver(publisher);
		observer2.setPublisherForObserver(publisher);

		observer1.isUpdateReadyForObserver(null);
		System.out.println("========going to publish new message========");
		publisher.postMessage("New Message");
	}
}
