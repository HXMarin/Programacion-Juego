package org.example;
import static org.example.models.Consolas.*;
import org.example.models.Juego;

public class Main {
    public static void main(String[] args) {
    Juego[] steam = new Juego[4];
    steam[0] = new Juego("BloodBorne",PLAYSTATION,29.99f);
    steam[1] = new Juego("Sekiro",PC,39.99f);
    steam[2] = new Juego("DarkSouls Remastered",PC,19.99f);
    steam[3] = new Juego("Elden Ring",PC,59.99f);
    fichaSteam(steam);
    }

    /**
     *
     * @param steam
     */
    private static void fichaSteam(Juego[] steam) {
        for (int i = 0; i < steam.length; i++) {
            System.out.println("El Juego es: "+ steam[i].getTitle()+
            "\n"+ "Para la plataforma: "+ steam[i].getConsoles()+
            "\n"+ "Precio: "+ steam[i].getPrice()+ " €");
        }
    }
}
