import java.util.Date;

public class Bibliotekarz extends Osoba {
    public String dataZatrudnienia;

    public Bibliotekarz(String imie, String nazwisko, String dataUr, String dataZatrudnienia) {
        super(imie, nazwisko, dataUr);
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(String dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return imie+", data zatrudnienia: " + dataZatrudnienia;
    }
}
