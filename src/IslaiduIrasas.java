import java.time.LocalDate;
import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas{
    private String atsiskaitymoBudas;
    private String islaiduKategorija;
    private String islaiduTipas;

    public IslaiduIrasas(float suma, LocalDateTime data, String papildomaInfo, int counter, String atsiskaitymoBudas, String islaiduKategorija, String islaiduTipas) {
        super(suma, data, papildomaInfo, counter);
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.islaiduKategorija = islaiduKategorija;
        this.islaiduTipas = islaiduTipas;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getIslaiduKategorija() {
        return islaiduKategorija;
    }

    public void setIslaiduKategorija(String islaiduKategorija) {
        this.islaiduKategorija = islaiduKategorija;
    }

    public String getIslaiduTipas() {
        return islaiduTipas;
    }

    public void setIslaiduTipas(String islaiduTipas) {
        this.islaiduTipas = islaiduTipas;
    }
//    public IslaiduIrasas(float suma, String dataLaikas, String kategorija, String atsiskaitymoBudas, String papildomaInfo, int counter) {
//        this.suma = suma;
//        this.dataLaikas = dataLaikas;
//        this.kategorija = kategorija;
//        this.atsiskaitymoBudas = atsiskaitymoBudas;
//        this.papildomaInfo = papildomaInfo;
//        this.counter = counter;
//    }
//
//    public int getCounter() {
//        return counter;
//    }
//
//    public void setCounter(int counter) {
//        this.counter = counter;
//    }
//
//    public IslaiduIrasas(float suma, LocalDate data, String kategorija, boolean arIbanka, String papildomaInfo) {
//    }
//
//    public float getSuma() {
//        return suma;
//    }
//
//    public void setSuma(float suma) {
//        this.suma = suma;
//    }
//
//    public String getKategorija() {
//        return kategorija;
//    }
//
//    public void setKategorija(String kategorija) {
//        this.kategorija = kategorija;
//    }
//
//    public String getAtsiskaitymoBudas() {
//        return atsiskaitymoBudas;
//    }
//
//    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
//        this.atsiskaitymoBudas = atsiskaitymoBudas;
//    }
//
//    public String getPapildomaInfo() {
//        return papildomaInfo;
//    }
//
//    public void setPapildomaInfo(String papildomaInfo) {
//        this.papildomaInfo = papildomaInfo;
//    }
//
//    public String getDataLaikas() {
//        return dataLaikas;
//    }
}