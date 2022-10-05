public class Main {
    public static void main(String[] args) {
        Czytelnik kazik = new Czytelnik("Kolo","Benc","2000-12-12");
        Czytelnik kazik1 = new Czytelnik("Kolso","Benc","2000-12-12");
        Ksiazka cos = new Ksiazka("Ktos","cos",false);
        kazik.wypozyczKsiazke(cos);
        Biblioteka biblioteka1 = Biblioteka.getBiblioteka();
        System.out.println(biblioteka1.czyJestCzytelnik(kazik));
        biblioteka1.dodajNowegoCzytelnika(kazik);
        System.out.println(kazik);
        System.out.println(biblioteka1);
        kazik.ileKsiazekWypozyczylCzytelnik();
    }
}