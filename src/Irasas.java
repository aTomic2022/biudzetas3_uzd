import java.time.LocalDateTime;

public class Irasas {
    private float suma;
    private LocalDateTime data;
    private String papildomaInfo;
    static int countas;
    private int counter;

    public Irasas(float suma, LocalDateTime data, String papildomaInfo, int counter) {
        this.suma = suma;
        this.data = data;
        this.papildomaInfo = papildomaInfo;
        this.counter= counter;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }


    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    public int getCounter() {
        return counter;
    }
}
