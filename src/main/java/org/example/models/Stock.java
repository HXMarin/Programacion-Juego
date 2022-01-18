package org.example.models;

public class Stock {
    int amount;
    Juego game;

    public Stock(int amount, Juego game) {
        this.amount = amount;
        this.game = game;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 1) {
            throw new IllegalStateException("No quedan Existencias");
        } else {
            this.amount = amount;
        }
    }

    public Juego getGame() {
        return game;
    }

    public void setGame(Juego game) {
        if (game == null) {
            throw new NullPointerException("No pueden haber Juegos Nulos");
        } else {
            this.game = game;
        }
    }
}
