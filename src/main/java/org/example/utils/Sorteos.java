package org.example.utils;

import org.example.models.Consolas;

public class Sorteos {
    private static final int PC_PERCENT = 30;
    private static final int SWITCH_PERCENT = 10;
    private static final int PLAYSTATION_PERCENT = 40;
    private static final int XBOX_PERCENT = 20;

    private static final int FREE_PERCENT = 10;
    private static final int FIRST_RANGE_PERCENT = 40;
    private static final int SECOND_RANGE_PERCENT= 50;

    public static Consolas lotteryPlatform() {
        int rNum = (int) Math.random() * 100;
        if (rNum < PC_PERCENT) {
            return Consolas.PC;
        } else if (rNum < (PC_PERCENT + SWITCH_PERCENT)) {
            return Consolas.SWITCH;
        } else if (rNum < (PC_PERCENT + SWITCH_PERCENT + PLAYSTATION_PERCENT)){
            return Consolas.PLAYSTATION;
        } else {
            return Consolas.XBOX;
        }
    }
    public static float lotteryPrice(){
        int rNum = (int) Math.random() * 100;
        if (rNum < FREE_PERCENT) {
            return 0;
        }else if (rNum < (FREE_PERCENT + FIRST_RANGE_PERCENT)){
            return (float) (Math.random() * (40 - 20)) + 20;
        } else{
            return (float) (Math.random() * (100 - 50)) + 50;
        }
    }
    public static String lotteryTitles(){
        String[] titulos = {"God Of War","League of Legends","Sekiro","Dark Souls III","BloodBorne","Elden Ring"};
        int rnum = (int) (Math.random()* titulos.length);
        return titulos[rnum];
    }
    public static int lotteryStock(){
        int[] amount = new int[100];
        int rnum = (int)(Math.random()* amount.length);
        return amount[rnum];
    }
}
