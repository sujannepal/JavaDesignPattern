package observerpattern2;

import java.util.ArrayList;

public class StockGrabber implements Subject{
    public ArrayList<Observer> observers = new ArrayList<>();
    private double stock1Price;
    private double stock2Price;
    private double stock3Price;

    @Override
    public void register(Observer newObserver){
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver){
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update(stock1Price, stock2Price, stock3Price);
        }
    }

    public void setStock1Price(double newStock1Price){
        this.stock1Price = newStock1Price;
        notifyObserver();
    }
    public void setStock2Price(double newStock2Price){
        this.stock2Price = newStock2Price;
        notifyObserver();
    }
    public void setStock3Price(double newStock3Price){
        this.stock3Price = newStock3Price;
        notifyObserver();
    }
}
