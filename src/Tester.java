public class Tester {

    public static void main(String[] args) {

        StockExchange nyStockExchange = new StockExchange();
        nyStockExchange.addObserver(53);
        nyStockExchange.addObserver(45);
        nyStockExchange.addObserver(57);
        nyStockExchange.addObserver(46);
        nyStockExchange.addObserver(58);

        while (nyStockExchange.stockMonitors.size() > 0) {
            nyStockExchange.tick();
        }


        // call tick repeatedly
        // remove stockmonitor when target price is reached
        // program stops when stockmonitors are all removed

    }

}
