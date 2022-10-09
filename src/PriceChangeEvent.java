public class PriceChangeEvent {

    int priceChange;
    StockExchange stockExchange;

    public PriceChangeEvent(int pc, StockExchange se) {
        this.priceChange = pc;
        this.stockExchange = se;
    }

}
