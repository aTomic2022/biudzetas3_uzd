import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PajamuIrasas extends Irasas{
    private boolean pozymisaArIbanka;
    private String pajamuKategorija;
    private String pajamuTipas;

    public PajamuIrasas(float suma, LocalDateTime data, String papildomaInfo, int counter, boolean pozymisaArIbanka, String pajamuKategorija, String pajamuTipas) {
        super(suma, data, papildomaInfo, counter);
        this.pozymisaArIbanka = pozymisaArIbanka;
        this.pajamuKategorija = pajamuKategorija;
        this.pajamuTipas = pajamuTipas;
    }

    public boolean isPozymisaArIbanka() {
        return pozymisaArIbanka;
    }

    public void setPozymisaArIbanka(boolean pozymisaArIbanka) {
        this.pozymisaArIbanka = pozymisaArIbanka;
    }

    public String getPajamuKategorija() {
        return pajamuKategorija;
    }

    public void setPajamuKategorija(String pajamuKategorija) {
        this.pajamuKategorija = pajamuKategorija;
    }

    public String getPajamuTipas() {
        return pajamuTipas;
    }

    public void setPajamuTipas(String pajamuTipas) {
        this.pajamuTipas = pajamuTipas;
    }

    @Override
    public String toString() {
        return "PajamuIrasas{" +
                "pozymisaArIbanka=" + pozymisaArIbanka +
                ", pajamuKategorija='" + pajamuKategorija + '\'' +
                ", pajamuTipas='" + pajamuTipas + '\'' +
                '}';
    }

}