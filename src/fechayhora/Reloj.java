package fechayhora;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Reloj implements Runnable {

    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread hilo;
    
    

    @Override
    public void run() {
        hilo = new Thread(this);

        hilo.start();
        Thread ct = Thread.currentThread();

        while (ct == hilo) {
            calcula();
            String i = hora + ":" + minutos + ":" + segundos;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        //verificar si la hora es am o pm
        if (ampm.equals("PM")) {

            int h = calendario.get(Calendar.HOUR_OF_DAY) - 24;
            hora = h > 9 ? "" + h : "0" + h;

        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

}
