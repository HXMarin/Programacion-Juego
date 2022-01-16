package org.example.models;

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
            throw new IllegalArgumentException("NO ESTÁ DENTRO DEL RANGO");
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




