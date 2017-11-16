package domain;

import javafx.scene.paint.Color;

public class Ampellogik {

    private static String zustand;


    public static void weiter() {

        switch (zustand) {
            case "ROT":
                zustand = "ROTGELB";

                break;
            case "ROTGELB":
                zustand = "GRUEN";

                break;
            case "GRUEN":
                zustand = "GELB";

                break;
            case "GELB":
                zustand = "ROT";

                break;
        }
    }
}