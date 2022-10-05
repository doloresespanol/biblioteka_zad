import java.util.ArrayList;

public class Czytelnik extends Osoba {
    public int nrCzytelnika;
    public ArrayList<Ksiazka> wypozyczoneKsiazki = new ArrayList<>();

    public Czytelnik(String imie, String nazwisko, String dataUr) {
        super(imie, nazwisko, dataUr);
        nrCzytelnika++;
    }

    public int getNrCzytelnika() {
        return nrCzytelnika;
    }

    public void setNrCzytelnika(int nrCzytelnika) {
        this.nrCzytelnika = nrCzytelnika;
    }

    public ArrayList<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

    public void setWypozyczoneKsiazki(ArrayList<Ksiazka> wypozyczoneKsiazki) {
        this.wypozyczoneKsiazki = wypozyczoneKsiazki;
    }

    public void wypozyczKsiazke(Ksiazka ksiazka){
        if(ksiazka.czyWypozyczona == false){
            wypozyczoneKsiazki.add(ksiazka);
        }else{
            System.out.println("Książka została już wypożyczona");
        }
    }

    @Override
    public String toString() {
        System.out.println("Czytelnik nr " + nrCzytelnika + "\nWypożyczone książki: ");

            for(Ksiazka x:wypozyczoneKsiazki) {
                System.out.println(x);
            }
            return "";
    }
    public void ileKsiazekWypozyczylCzytelnik(){
        System.out.println("Czytelnik wypożyczył "+wypozyczoneKsiazki.size()+" książek");
    }
}
