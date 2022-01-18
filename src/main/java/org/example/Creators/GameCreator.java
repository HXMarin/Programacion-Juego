package org.example.Creators;
import org.example.models.Consolas;
import org.example.models.Juego;
import org.example.utils.Sorteos;

public class GameCreator {
    public static Juego randomBuilder(){
    String title = Sorteos.lotteryTitles();
    Consolas platform = Sorteos.lotteryPlatform();
    float price = Sorteos.lotteryPrice();
    return new Juego(title, platform,price);
    }



}
