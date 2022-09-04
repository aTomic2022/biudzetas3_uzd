import java.time.LocalDate;
import java.time.LocalDateTime;

public class IslaiduIrasas {
    private float suma;
    private String dataLaikas;
    private String kategorija;
    private String atsiskaitymoBudas;
    private String papildomaInfo;

    public IslaiduIrasas(float suma, String dataLaikas, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        this.suma = suma;
        this.dataLaikas = dataLaikas;
        this.kategorija = kategorija;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.papildomaInfo = papildomaInfo;
    }

    public IslaiduIrasas(float suma, LocalDate data, String kategorija, boolean arIbanka, String papildomaInfo) {
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    public String getDataLaikas() {
        return dataLaikas;
    }
}