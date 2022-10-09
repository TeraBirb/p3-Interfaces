public class StockMonitor implements StockObserver{

    int steps = 0;
    int target;

    public void priceChanged(PriceChangeEvent pce) {

        steps++;
        if (pce.stockExchange.price == target) {
            System.out.println("Target of $" + target + " is reached at step " + steps);
        }

    }

    public StockMonitor(int t) {
        this.target = t;
    }

}

// each monitor will have a unique target price for multiple monitors to make sense