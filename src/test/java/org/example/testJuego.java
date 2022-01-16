package org.example;

import org.example.models.Juego;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.MethodOrderer.*;
import org.junit.jupiter.api.DisplayName;
import static org.example.models.Consolas.*;

@DisplayName("Test del Juego")
@TestMethodOrder(OrderAnnotation.class)

public class testJuego {
    private Juego juego = new Juego("BloodBorne",PLAYSTATION, 29.99f);

    @Test
    @Order(1)
    @DisplayName("Test Juego Constructor")
    void testConstructor() {
        Juego juego = new Juego("BloodBorne",PLAYSTATION, 29.99f);
        Assertions.assertAll(
                () -> assertEquals("BloodBorne", juego.getTitle()),
                () -> assertEquals(PLAYSTATION, juego.getConsoles()),
                () -> assertEquals(29.99f, juego.getPrice())
        );
    }

    @Test
    void testGetTitle() {
        assertEquals("BloodBorne", juego.getTitle());
    }

    @Test
    void testSetTitle() {
       juego.setTitle("BloodBorne");
       assertEquals("BloodBorne",juego.getTitle());
    }

    @Test
    void testGetPrice() {
        assertEquals(29.99f, juego.getPrice());
    }

    @Test
    void testSetPrice() {
        juego.setPrice(29.99f);
        assertEquals(29.99f, juego.getPrice());
    }

    @Test
    void testSetPriceExceptions() {

    }
    @Test
    void TestGetConsole(){
        assertEquals(PLAYSTATION,juego.getConsoles());
    }
    @Test
    void testSetConsole(){
    juego.setConsoles(PLAYSTATION);
    assertEquals(PLAYSTATION,juego.getConsoles());
    }

}
