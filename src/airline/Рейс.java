package airline;

import java.util.ArrayList;

public class Рейс {
    String номер;
    String откуда;
    String куда;
    int вместимость;
    ArrayList<Пассажир> список = new ArrayList<>();

    Рейс(String номер, String откуда, String куда, int вместимость) {
        this.номер = номер;
        this.откуда = откуда;
        this.куда = куда;
        this.вместимость = вместимость;
    }

    void добавитьПассажира(Пассажир п) {
        if (список.size() < вместимость) {
            список.add(п);
        } else {
            System.out.println("Мест на рейсе " + номер + " больше нет!");
        }
    }

    void показатьПассажиров() {
        System.out.println("Пассажиры рейса " + номер + ":");
        for (Пассажир п : список) {
            System.out.println(п);
        }
    }
}
