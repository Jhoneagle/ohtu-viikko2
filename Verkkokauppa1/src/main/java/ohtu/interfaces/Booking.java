package ohtu.interfaces;

import java.util.ArrayList;

public interface Booking {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
