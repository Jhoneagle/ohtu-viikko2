package ohtu.verkkokauppa;

import ohtu.interfaces.Bank;
import ohtu.interfaces.Booking;

public class Pankki implements Bank {
    private Booking kirjanpito;

    public Pankki(Booking accounting) {
        kirjanpito = accounting;
    }

    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
