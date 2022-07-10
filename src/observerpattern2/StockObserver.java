package observerpattern2;

public class StockObserver implements Observer{
    private double stock1Price;
    private double stock2Price;
    private double stock3Price;

    private  static int observerIdTracker = 0;
    private int observerId;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New Observer " + this.observerId);
        stockGrabber.register(this);
    }
    @Override
    public void update(double stock1Price, double stock2Price, double stock3Price) {
        this.stock1Price = stock1Price;
        this.stock2Price = stock2Price;
        this.stock3Price = stock3Price;
        printStockPrices();
    }
    public void printStockPrices(){
        System.out.println(observerId + "\n stock1: " + stock1Price+
                                        "\n stock2: " + stock2Price+
                                        "\n stock3: " + stock3Price);
    }
}
