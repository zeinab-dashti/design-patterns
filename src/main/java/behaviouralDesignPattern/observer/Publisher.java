package behaviouralDesignPattern.observer;

public interface Publisher {
    void register(Observer observer);
    void unRegister(Observer observer);

    void notifyObservers(String s);
}
