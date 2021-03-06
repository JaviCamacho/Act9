/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Javier Camacho
 */
public class Deck {

    private Random suerte;
    private ArrayList<Card> baraja;
    private String[] palosN, palosR, valores;

    public Deck() {
        suerte = new Random();
        baraja = new ArrayList<>();
        palosN = new String[]{"Picas", "Treboles"};
        palosR = new String[]{"Corazones", "Diamantes"};
        valores = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int j = 0; j < palosR.length; j++) {
            for (int k = 0; k < valores.length; k++) {
                baraja.add(new Card(palosR[j], valores[k], "Rojo"));
            }
        }
        for (int j = 0; j < palosN.length; j++) {
            for (int k = 0; k < valores.length; k++) {
                baraja.add(new Card(palosR[j], valores[k], "Negro"));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(baraja);
        System.out.println("Se mezclo el Deck.");
    }

    public void head() {
        System.out.println(baraja.get(0).toString());
        baraja.remove(0);
        System.out.println("Quedan " + baraja.size() + " en el Deck.");
    }

    public void pick() {
        int carta = suerte.nextInt(baraja.size());
        System.out.println(baraja.get(carta).toString());
        baraja.remove(carta);
        System.out.println("Quedan " + baraja.size() + " en el Deck.");
    }

    public void hand() {
        for (int i = 0; i < 5; i++) {
            int carta = suerte.nextInt(baraja.size());
            System.out.println(baraja.get(carta).toString());
            baraja.remove(carta);
        }
        System.out.println("Quedan " + baraja.size() + " en el Deck.");
    }

}
