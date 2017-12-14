package model;

import java.time.LocalDateTime;
import java.util.Date;

abstract class Logger {


    abstract void log(Ampelphase phase);

    String getTimeAsString(){
        LocalDateTime jetzt = LocalDateTime.now();
        String text = jetzt.toString();
        return text;
    }

}
