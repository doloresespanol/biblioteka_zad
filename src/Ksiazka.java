public class Ksiazka {
    public String tytul;
    public String autor;
    public boolean czyWypozyczona;

    public Ksiazka(String tytul, String autor, boolean czyWypozyczona) {
        this.tytul = tytul;
        this.autor = autor;
        this.czyWypozyczona = czyWypozyczona;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isCzyWypozyczona() {
        return czyWypozyczona;
    }

    public void setCzyWypozyczona(boolean czyWypozyczona) {
        this.czyWypozyczona = czyWypozyczona;
    }

    public void sprawdzCzyKsiazkaJestDostepna(Ksiazka ksiazka){
        if(ksiazka.isCzyWypozyczona()==true){
            System.out.println("Książka nie jest dostępna");
        }else{
            System.out.println("Ksiąsżka jest dostępna");
        }
    }

    @Override
    public String toString() {
        return "Tytuł: "+tytul+", Autor: "+autor;
    }
}
