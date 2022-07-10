package observerpattern2;

public class GrabStocks {
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

       stockGrabber.setStock1Price(150.00);
//        stockGrabber.setStock2Price(250.00);
//        stockGrabber.setStock3Price(200.00);

        StockObserver observer2 = new StockObserver(stockGrabber);

        //stockGrabber.setStock1Price(151.00);
        stockGrabber.setStock2Price(251.00);
        stockGrabber.setStock3Price(201.00);

        stockGrabber.unregister(observer1);

        StockObserver observer3 = new StockObserver(stockGrabber);


        //stockGrabber.setStock1Price(152.00);
        stockGrabber.setStock2Price(252.00);
        //stockGrabber.setStock3Price(202.00);
    }
}
