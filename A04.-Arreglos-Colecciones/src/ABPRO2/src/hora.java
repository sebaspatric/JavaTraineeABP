package ABPRO2.src;

import java.sql.Time;

public class hora {
    public static void main(String[] args) {
        String hora1 = "23:00";
        Time n1 = Time.valueOf(hora1 + ":00");

        String hora2 = "02:15";
        Time n2 = Time.valueOf(hora2 + ":00");
    }
}
