import java.util.ArrayList;

public class Biblioteka {
    private static Biblioteka Biblioteka = new Biblioteka();
    public ArrayList<Czytelnik> czytelnicy = new ArrayList<Czytelnik>();
    public ArrayList<Bibliotekarz> bibliotekarze = new ArrayList<Bibliotekarz>();
    public ArrayList<Ksiazka> ksiazki = new ArrayList<Ksiazka>();

    public Biblioteka() {
    }

    public ArrayList<Czytelnik> getCzytelnicy() {
        return czytelnicy;
    }

    public void setCzytelnicy(ArrayList<Czytelnik> czytelnicy) {
        this.czytelnicy = czytelnicy;
    }

    public ArrayList<Bibliotekarz> getBibliotekarze() {
        return bibliotekarze;
    }

    public void setBibliotekarze(ArrayList<Bibliotekarz> bibliotekarze) {
        this.bibliotekarze = bibliotekarze;
    }

    public ArrayList<Ksiazka> getKsiazki() {
        return ksiazki;
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
        System.out.println("\nCzytelnicy: "+ getCzytelnicy() + ", Bibliotekarze: " + bibliotekarze + ", Ksiazki: " + ksiazki);
        return "";
    }

    public boolean czyJestCzytelnik(Czytelnik czytelnik){
        return czytelnicy.contains(czytelnik);
    }

    public void dodajNowegoCzytelnika(Czytelnik czytelnik){
        if(czyJestCzytelnik(czytelnik)){
            System.out.println("W tej bibliotece jest już taki czytelnik");
        }else{
            czytelnicy.add(czytelnik);
        }
    }
}
