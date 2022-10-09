import java.util.ArrayList;
import java.util.Random;

public class StockExchange {

    int price = 50;
    StockPricePrinter stockPricePrinter = new StockPricePrinter();
    ArrayList<StockMonitor> stockMonitors = new ArrayList<StockMonitor>();

    public void tick() {

        int priceChange;

        Random rng = new Random();
        if (rng.nextInt(2) == 0) {
            priceChange = -1;
        } else {
            priceChange = 1;
        }

        price += priceChange;

        // all stock monitors will recieve a pricechangeevent
        // remove specific monitor based on index
        // the one stockpriceprinter prints

        for (int i = 0; i < stockMonitors.size(); i++) {
            stockMonitors.get(i).priceChanged(new PriceChangeEvent(priceChange, this));
            if (price == stockMonitors.get(i).target) {
                removeObserver(i);
            }
        }

        stockPricePrinter.priceChanged(new PriceChangeEvent(priceChange, this));

    }

    public void addObserver(int t) {
        StockMonitor e = new StockMonitor(t);
        stockMonitors.add(e);
    }

    public void removeObserver(int i) {
        if (stockMonitors.size() != 0) {
            stockMonitors.remove(i);
        } else {
            throw new java.lang.Error("Tried to remove empty stockMonitors ArrayList!");
        }
    }

}
