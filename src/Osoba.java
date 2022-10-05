import java.util.Date;

public abstract class Osoba {
    public String imie;
    public String nazwisko;
    public String dataUr;

    public Osoba(String imie, String nazwisko, String dataUr) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUr = dataUr;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUr(String dataUr) {
        this.dataUr = dataUr;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getDataUr() {
        return dataUr;
    }

    @Override
    public String toString() {
        return "Osoba nazywa się " + imie + " " + nazwisko + " urodzona: " + dataUr;
    }
}
