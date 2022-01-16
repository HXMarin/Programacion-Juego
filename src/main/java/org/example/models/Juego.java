package org.example.models;

import java.util.Locale;

public class Juego {
final float MIN_PRICE = 0.00f;
final float MAX_PRICE = 200.00f;

private String title;
private Consolas consoles;
private float price;

public Juego(String title,Consolas consoles,float price){
setPrice(price);
setConsoles(consoles);
setTitle(title);
}
    public Juego(String title, String console, float price) {
        setTitle(title);
        setConsoles(Consolas.valueOf(console.toUpperCase(Locale.ROOT)));
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            throw new IllegalArgumentException(String.format("El Precio tiene que estar entre %2g y %2g",MIN_PRICE,MAX_PRICE));
        }else{
            this.price = price;
        }
    }

    public Consolas getConsoles() {
        return consoles;
    }

    public void setConsoles(Consolas consoles) {
        this.consoles = consoles;
    }
}




