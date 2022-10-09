public class StockPricePrinter implements StockObserver{

    public void priceChanged(PriceChangeEvent pce) {

        System.out.println("Price: $" + pce.stockExchange.price);

    }
}
