import java.time.LocalDate;

public class PajamuIrasas {
    private float suma;
    private String data;
    private String kategorija;
    private boolean pozymisaArIbanka;
    private String papildomaInfo;
    static int countas;
    private int count;


    public PajamuIrasas(float suma, String data, String kategorija, boolean pozymisaArIbanka, String papildomaInfo, int count) {
        this.suma = suma;
        this.data = data;
        this.kategorija = kategorija;
        this.pozymisaArIbanka = pozymisaArIbanka;
        this.papildomaInfo = papildomaInfo;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public String getData() {
        return data;
    }


    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public boolean getPozymisaArIbanka() {
        return pozymisaArIbanka;
    }

    public void setPozymisaArIbanka(boolean pozymisaArIbanka) {
        this.pozymisaArIbanka = pozymisaArIbanka;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }
}