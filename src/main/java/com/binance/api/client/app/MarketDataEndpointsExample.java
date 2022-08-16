package com.binance.api.client.app;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.TickerStatistics;

/**
 * Examples on how to get market data information such as the latest price of a symbol, etc.
 */
public class MarketDataEndpointsExample {

  public static String startApp() throws Exception {
    BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
    BinanceApiRestClient client = factory.newRestClient();

    // Getting latest price of a symbol
    TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

    String answer = "";


    answer += "USDTUAH Binance: " + " \n";
    answer += "BidPrice: " + tickerStatistics.getBidPrice() + "\n";
    answer += "AskPrice: " + tickerStatistics.getAskPrice() + "\n";

    answer += "USDTUAH WhiteBit: " + " \n";
    answer += "BidPrice: " + WhiteBitConnection.getWBBid() + "\n";
    answer += "AskPrice: " + WhiteBitConnection.getWBAsk() + "\n";


    double BB = Double.parseDouble(tickerStatistics.getBidPrice());
    double BA = Double.parseDouble(tickerStatistics.getAskPrice());
    double WB = Double.parseDouble(WhiteBitConnection.getWBBid());
    double WA = Double.parseDouble(WhiteBitConnection.getWBAsk());

    answer += "1 variant:" + "\n";
    boolean c11 = ((WA < BB) && BB - WA > BB / 200);
    boolean c12 = ((WA < BB) && BB - WA > BB / 125);
    boolean c14 = (WB > BA) && WB - BA > (WB / 500);
    boolean c15 = ((WB > BA) && WB - BA > (WB / 200));
    boolean c13 = !c11 && !c12 && !c14 && !c15;

    answer += "1. WhiteBit ask < Binance Bid (> 0.5 %)" + c11 + "\n";
    answer += "2. WhiteBit ask < Binance Bid (> 0.8 %)" + c12 + "\n";
    answer += "3. WhiteBit ask == Binance Bid             " + c13 + "\n";
    answer += "4. WhiteBit bid > Binance Ask (>0.2 %)" + c14 + "\n";
    answer += "5. WhiteBit bid > Binance Ask (>0.5 %)" + c15 + "\n";


    answer += "\n2 variant:+ \n";

    boolean c21 = ((WB < BA) && BA - WB > BA / 200);
    boolean c22 = ((WB < BA) && BA - WB > BA / 125);
    boolean c24 = (WA > BB) && WA - BB > (WA / 500);
    boolean c25 = ((WA > BB) && WA - BB > (WA / 200));
    boolean c23 = !c11 && !c12 && !c14 && !c15;
    answer += "6. WhiteBit bid < Binance ask (> 0.5 %)" + c21 + "\n";
    answer += "7. WhiteBit bid < Binance ask (> 0.8 %)" + c22 + "\n";
    answer += "8. WhiteBit bid == Binance ask             " + c23 + "\n";
    answer += "9. WhiteBit ask > Binance bid (>0.2 %)" + c24 + "\n";
    answer += "10. WhiteBit ask > Binance bid (>0.5 %)" + c25 + "\n";

    return answer;
  }

  public static String startApp1(long time) throws Exception {
    String answer = "";

    double startTime = System.currentTimeMillis();
    while (true) {
      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {

        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BB = Double.parseDouble(tickerStatistics.getBidPrice());
        double WA = Double.parseDouble(WhiteBitConnection.getWBAsk());

        boolean c11 = ((WA < BB) && BB - WA > BB / 200);


        if (c11) {
          answer += "1. WhiteBit ask < Binance Bid (> 0.5 %)" + true + "\n";
          break;
        }
      } else {
        answer = "1. WhiteBit ask < Binance Bid (> 0.5 %) is still false.\nIf you want to continue, enter\"2\"";
        break;
      }
    }
    return answer;
  }

  public static String startApp2(long time) throws Exception {
    String answer = "";

    double startTime = System.currentTimeMillis();
    while (true) {
      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BB = Double.parseDouble(tickerStatistics.getBidPrice());
        double WA = Double.parseDouble(WhiteBitConnection.getWBAsk());

        boolean c12 = ((WA < BB) && BB - WA > BB / 125);

        if (c12) {
          answer += "2. WhiteBit ask < Binance Bid (> 0.8 %)" + true + "\n";
          break;
        }
      } else {
        answer = "2. WhiteBit ask < Binance Bid (> 0.8 %) is still false.\nIf you want to continue, enter\"2\"";
        break;
      }
    }
    return answer;
  }

  public static String startApp4(long time) throws Exception {
    String answer = "";

    double startTime = System.currentTimeMillis();
    while (true) {
      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BA = Double.parseDouble(tickerStatistics.getAskPrice());
        double WB = Double.parseDouble(WhiteBitConnection.getWBBid());

        boolean c14 = (WB > BA) && WB - BA > (WB / 500);

        if (c14) {
          answer += "4. WhiteBit bid > Binance Ask (>0.2 %)" + true + "\n";
          break;
        }
      } else {
        answer = "4. WhiteBit bid > Binance Ask (>0.2 %) is still false.\nIf you want to continue, enter\"4\"";
        break;
      }
    }
    return answer;
  }


  public static String startApp5(long time) throws Exception {
    String answer = "";
    double startTime = System.currentTimeMillis();
    while (true) {
      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BA = Double.parseDouble(tickerStatistics.getAskPrice());
        double WB = Double.parseDouble(WhiteBitConnection.getWBBid());

        boolean c15 = ((WB > BA) && WB - BA > (WB / 200));

        if (c15) {
          answer += "5. WhiteBit bid > Binance Ask (>0.5 %)" + true + "\n";
          break;
        }
      } else {
        answer = "5. WhiteBit bid > Binance Ask (>0.5 %) is still false.\nIf you want to continue, enter\"6\"";
        break;
      }
    }
    return answer;
  }


  public static String startApp6(long time) throws Exception {
    String answer = "";
    double startTime = System.currentTimeMillis();
    while (true) {
      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BA = Double.parseDouble(tickerStatistics.getAskPrice());
        double WB = Double.parseDouble(WhiteBitConnection.getWBBid());

        boolean c21 = ((WB < BA) && BA - WB > BA / 200);

        if (c21) {
          answer += "6. WhiteBit bid < Binance ask (> 0.5 %)" + true + "\n";
          break;
        }
      } else {
        answer = "6. WhiteBit bid < Binance ask (> 0.5 %) is still false.\nIf you want to continue, enter\"6\"";
        break;
      }
    }
    return answer;
  }


  public static String startApp7(long time) throws Exception {
    String answer = "";
    double startTime = System.currentTimeMillis();
    while (true) {
      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {

        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BA = Double.parseDouble(tickerStatistics.getAskPrice());
        double WB = Double.parseDouble(WhiteBitConnection.getWBBid());

        boolean c22 = ((WB < BA) && BA - WB > BA / 125);

        if (c22) {
          answer = "7. WhiteBit bid < Binance ask (> 0.8 %)" + c22 + "\n";
          break;
        }
      } else {
        answer = "7. WhiteBit bid < Binance ask (> 0.8 %) is still false.\nIf you want to continue, enter\"7\"";
        break;
      }
    }
    return answer;
  }

  public static String startApp9(long time) throws Exception {
    String answer = "";
    double startTime = System.currentTimeMillis();
    while (true) {

      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BB = Double.parseDouble(tickerStatistics.getBidPrice());
        double WA = Double.parseDouble(WhiteBitConnection.getWBAsk());

        boolean c24 = (WA > BB) && WA - BB > (WA / 500);

        if (c24) {
          answer += "9. WhiteBit ask > Binance bid (>0.2 %)" + true + "\n";
          break;
        }
      } else {
        answer = "9. WhiteBit ask > Binance bid (>0.2 %) is still false.\nIf you want to continue, enter \"9\"";
        break;
      }
    }
    return answer;
  }

  public static String startApp10(long time) throws Exception {
    String answer = "";
    double startTime = System.currentTimeMillis();
    while (true) {
      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {

        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BB = Double.parseDouble(tickerStatistics.getBidPrice());
        double WA = Double.parseDouble(WhiteBitConnection.getWBAsk());

        boolean c25 = ((WA > BB) && WA - BB > (WA / 200));

        if (c25) {
          answer += "10. WhiteBit ask > Binance bid (>0.5 %)" + true + "\n";
          break;
        }
      } else {
        answer = "10. WhiteBit ask > Binance bid (>0.5 %) is still false.\nIf you want to continue, enter \"10\"";
        break;
      }
    }
    return answer;
  }

  public static String startApp8(long time) throws Exception {

    String answer = "";
    double startTime = System.currentTimeMillis();
    while (true) {
      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {

        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BB = Double.parseDouble(tickerStatistics.getBidPrice());
        double BA = Double.parseDouble(tickerStatistics.getAskPrice());
        double WB = Double.parseDouble(WhiteBitConnection.getWBBid());
        double WA = Double.parseDouble(WhiteBitConnection.getWBAsk());

        boolean c21 = ((WB < BA) && BA - WB > BA / 200);
        boolean c22 = ((WB < BA) && BA - WB > BA / 125);
        boolean c24 = (WA > BB) && WA - BB > (WA / 500);
        boolean c25 = ((WA > BB) && WA - BB > (WA / 200));
        boolean c23 = !c21 && !c22 && !c24 && !c25;

        if (c23) {
          answer += "\"8. WhiteBit bid == Binance ask" + true + "\n";
          break;
        }
      } else {
        answer = "\"8. WhiteBit bid == Binance ask\nIf you want to continue, enter \"8\"";
        break;
      }
    }
    return answer;

  }

  public static String startApp3(long time) throws Exception {

    String answer = "";
    double startTime = System.currentTimeMillis();
    while (true) {
      double currentTime = System.currentTimeMillis();
      if (!(currentTime - startTime > time)) {

        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("USDTUAH");

        double BB = Double.parseDouble(tickerStatistics.getBidPrice());
        double BA = Double.parseDouble(tickerStatistics.getAskPrice());
        double WB = Double.parseDouble(WhiteBitConnection.getWBBid());
        double WA = Double.parseDouble(WhiteBitConnection.getWBAsk());

        boolean c11 = ((WA < BB) && BB - WA > BB / 200);
        boolean c12 = ((WA < BB) && BB - WA > BB / 125);
        boolean c14 = (WB > BA) && WB - BA > (WB / 500);
        boolean c15 = ((WB > BA) && WB - BA > (WB / 200));
        boolean c13 = !c11 && !c12 && !c14 && !c15;

        if (c13) {
          answer += "\"3. WhiteBit ask == Binance Bid" + true + "\n";
          break;
        }
      } else {
        answer = "\"3. WhiteBit ask == Binance Bid\nIf you want to continue, enter \"3\"";
        break;
      }
    }
    return answer;

  }

}

