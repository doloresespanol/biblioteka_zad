import java.util.ArrayList;

public class Biblioteka {
    private static Biblioteka Biblioteka = new Biblioteka();
    public ArrayList<Czytelnik> czytelnicy = new ArrayList<>();
    public ArrayList<Bibliotekarz> bibliotekarze = new ArrayList<>();
    public ArrayList<Ksiazka> ksiazki = new ArrayList<>();

    public Biblioteka() {
    }

    public void wypiszBibliotekarzy() {
        for(Bibliotekarz x:bibliotekarze){
            System.out.print(x+" ");
        }
    }

    public void setCzytelnicy(ArrayList<Czytelnik> czytelnicy) {
        this.czytelnicy = czytelnicy;
    }

    public void wypiszCzytelnikow() {
        for(Czytelnik x:czytelnicy){
            System.out.print(x+" ");
        }
    }

    public void setBibliotekarze(ArrayList<Bibliotekarz> bibliotekarze) {
        this.bibliotekarze = bibliotekarze;
    }

    public void wypiszKsiazki() {
        for(Ksiazka x:ksiazki){
            System.out.print(x+" ");
        }
    }

    public void setKsiazki(ArrayList<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }

    public static Biblioteka getBiblioteka() {
        return Biblioteka;
    }

    public static void setBiblioteka(Biblioteka biblioteka) {
        Biblioteka = biblioteka;
    }

    @Override
    public String toString() {
        System.out.print("=============================================\nCzytelnicy: \n\n");
        wypiszCzytelnikow();
        System.out.println("\n");
        System.out.println("=============================================\nBibliotekarze: \n");
        wypiszBibliotekarzy();
        System.out.println("\n");
        System.out.println("=============================================\nKsiążki: \n");
        wypiszKsiazki();
        System.out.println("\n\n=============================================");
        return "";
    }

    public boolean czyJestCzytelnik(Czytelnik czytelnik){
        return czytelnicy.contains(czytelnik);
    }

    public void dodajNowegoCzytelnika(Czytelnik czytelnik){
        if(czyJestCzytelnik(czytelnik)){
            System.out.println("Ww tej bibliotece jest już taki czytelnik");
        }else{
            czytelnicy.add(czytelnik);
        }
    }
    public boolean czyJestBibliotekarz(Bibliotekarz bibliotekarz){
        return bibliotekarze.contains(bibliotekarz);
    }
    public void dodajNowegoBibliotekarza(Bibliotekarz bibliotekarz){
        if(czyJestBibliotekarz(bibliotekarz)){
            System.out.println("Ww tej bibliotece jest już taki bibliotekarz");
        }else{
            bibliotekarze.add(bibliotekarz);
        }
    }
    public boolean czyJestKsiazka(Ksiazka ksiazka){
        return ksiazki.contains(ksiazka);
    }
    public void dodajNowaKsiazke(Ksiazka ksiazka){
        if(czyJestKsiazka(ksiazka)){
            System.out.println("Ww tej bibliotece jest już taka książka");
        }else{
            ksiazki.add(ksiazka);
        }
    }
}
