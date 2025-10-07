package airline;

public class Пассажир extends Человек {
    String паспорт;
    int баллы;

    Пассажир(String id, String имя, String паспорт, int баллы) {
        super(id, имя);
        this.паспорт = паспорт;
        this.баллы = баллы;
    }

    public String toString() {
        return имя + " (" + id + "), Паспорт: " + паспорт + ", Баллы: " + баллы;
    }
}
