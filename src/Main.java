public class Main {
    public static void main(String[] args) {
        Czytelnik kazik = new Czytelnik("Kolo","Benc","2000-12-12");
        Bibliotekarz maria = new Bibliotekarz("Maria","belko","2000-12-12","2020-12-12");
        Ksiazka cos = new Ksiazka("Ktos","cos",false);
        kazik.wypozyczKsiazke(cos);
        Biblioteka biblioteka1 = Biblioteka.getBiblioteka();
        //System.out.println(biblioteka1.czyJestCzytelnik(kazik));
        biblioteka1.dodajNowegoCzytelnika(kazik);
        //System.out.println(kazik);
        //System.out.println(biblioteka1);
        biblioteka1.czyJestBibliotekarz(maria);
        biblioteka1.dodajNowegoBibliotekarza(maria);
        biblioteka1.dodajNowaKsiazke(cos);
        System.out.println(biblioteka1);
        //kazik.ileKsiazekWypozyczylCzytelnik();
        //cos.sprawdzCzyKsiazkaJestDostepna();
    }
}