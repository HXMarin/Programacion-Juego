package org.example.Creators;

import org.example.models.Stock;
import org.example.utils.Sorteos;

public class StockCreator {
    public static Stock randomBuilder(){
        int amount = Sorteos.lotteryStock();
        return new Stock(amount,GameCreator.randomBuilder());
    }
}
