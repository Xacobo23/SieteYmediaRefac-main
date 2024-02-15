package sieteymedia;

import recursos.Baraja;
import recursos.Carta;


import java.util.Scanner;

public class SieteYMedia {
    Baraja baraja;
    Carta[] cartasJugador;
    Carta[] cartasBanca;
    Scanner sc = new Scanner(System.in);

    public SieteYMedia() {
        baraja = new Baraja();
        baraja.barajar();
        cartasJugador = new Carta[15];
        cartasBanca = new Carta[15];
    }

    public Carta[] getCartasJugador() {
        return cartasJugador;
    }

    public Carta[] getCartasBanca() {
        return cartasBanca;
    }

    double valorCartas(Carta[] cartas) {
        double total = 0.0;
        int val;
        int i = 0;
        while (cartas[i] != null) {
            val = cartas[i].getNumero();
            total += (val > 7) ? 0.5 : val;
            i++;
        }

        return total;
    }

    void insertarCartaEnArray(Carta[] cartas, Carta c) {
        int i = 0;
        while (cartas[i] != null) {
            i++;
        }
        cartas[i] = c;

    }

    void turnoJugador(){
        Carta c = baraja.darCartas(1)[0];
        insertarCartaEnArray(cartasJugador, c);
    }
    void turnoBanca(){
        Carta c = baraja.darCartas(1)[0];
        insertarCartaEnArray(cartasBanca, c);
    }
}
