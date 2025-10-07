package airline;

import java.util.ArrayList;
import java.util.HashMap;

public class Бронирования {
    HashMap<String, Рейс> рейсы = new HashMap<>();

    void добавитьРейс(Рейс р) {
        рейсы.put(р.номер, р);
    }

    void забронировать(Пассажир п, String номер) {
        Рейс р = рейсы.get(номер);
        if (р != null) {
            р.добавитьПассажира(п);
        } else System.out.println("Такого рейса нет!");
    }

    void показатьПассажиров(String номер) {
        Рейс р = рейсы.get(номер);
        if (р != null) {
            р.показатьПассажиров();
        }
    }

    void топПассажиров() {
        ArrayList<Пассажир> все = new ArrayList<>();
        for (Рейс р : рейсы.values()) {
            все.addAll(р.список);
        }

        for (int i = 0; i < все.size() - 1; i++) {
            for (int j = 0; j < все.size() - i - 1; j++) {
                if (все.get(j).баллы < все.get(j + 1).баллы) {
                    Пассажир temp = все.get(j);
                    все.set(j, все.get(j + 1));
                    все.set(j + 1, temp);
                }
            }
        }

        System.out.println("Пассажиров по баллам:");
        for (int i = 0; i < все.size() && i < 2; i++) {
            System.out.println(все.get(i));
        }
    }
}
