import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {

    ArrayList<PajamuIrasas> pajamuIrasasArrayList = new ArrayList<>();
    ArrayList<IslaiduIrasas> islaiduIrasasArrayList = new ArrayList<>();

    public void pridetiPajamuIrasa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įvesk suma:");
        float suma = sc.nextFloat();
        LocalDate data = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatuotaData = data.format(dtf);
        System.out.println("Ivesk kategorija:");
        String kategorija = sc.next();
        System.out.println("pasirink ar į banką (jei taip įvedame <true>, jei ne <false>):");
        boolean arIbanka = sc.nextBoolean();
        System.out.println("Įvesk papildomą informaciją:");
        String papildomaInfo = sc.next();
        PajamuIrasas pajamuI = new PajamuIrasas(suma, formatuotaData, kategorija, arIbanka, papildomaInfo);
        pajamuIrasasArrayList.add(pajamuI);
        System.out.println("Pridėtas pajamų įrašas");

    }


    public void pridetiIslaiduIrasa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įvesk sumą: ");
        float suma = sc.nextFloat();
        LocalDateTime dataLaikas = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formatuotaDataLaikas = dataLaikas.format(dtf);
        System.out.println("Įveskite kategoriją: ");
        String kategorija = sc.next();
        System.out.println("Įveskite atsiskaitymo būdą");
        String atsikBudas = sc.next();
        System.out.println("Įvesk papildomą informaciją:");
        String papildomaInfo = sc.next();
        IslaiduIrasas islaiduI = new IslaiduIrasas(suma, formatuotaDataLaikas, kategorija, atsikBudas, papildomaInfo);
        islaiduIrasasArrayList.add(islaiduI);
    }

    public void gautiPajamuIrasa(int i) {
        System.out.println("Suma: " + pajamuIrasasArrayList.get(i).getSuma() + "\nData: " + pajamuIrasasArrayList.get(i).getData() + "\nKategorija: " +
                pajamuIrasasArrayList.get(i).getKategorija() + "\nĮ banką: " + pajamuIrasasArrayList.get(i).getPozymisaArIbanka() + "\nPapildoma informacija: " + pajamuIrasasArrayList.get(i).getPapildomaInfo());
        System.out.println();
    }

    public void gautiIslaiduIrasa(int i) {
        System.out.println("Suma: " + islaiduIrasasArrayList.get(i).getSuma() + "\nData: " + islaiduIrasasArrayList.get(i).getDataLaikas() + "\nKategorija: " +
                islaiduIrasasArrayList.get(i).getKategorija() + "\nAtsiskaitymo būdas: " + islaiduIrasasArrayList.get(i).getAtsiskaitymoBudas() + "\nPapildoma informacija: " + islaiduIrasasArrayList.get(i).getPapildomaInfo());
        System.out.println();
    }

    public void balansas() {
        double pajamuSuma = 0;
        double islaiduSuma = 0;
        double balansas;
        for (int i = 0; i < pajamuIrasasArrayList.size(); i++) {
            pajamuSuma = pajamuSuma + pajamuIrasasArrayList.get(i).getSuma();
        }
        for (int i = 0; i < islaiduIrasasArrayList.size(); i++) {
            islaiduSuma = islaiduSuma + islaiduIrasasArrayList.get(i).getSuma();
        }
        balansas = pajamuSuma - islaiduSuma;
        System.out.println("Balansas => " + balansas);
    }

    public void visosPajamos() {
        for (int i = 0; i < pajamuIrasasArrayList.size(); i++) {
            String pajamuIsvedimas = String.format("Pajamos: %,.2f EUR, -> data:%s, kategorija - %s, pozymis - %b, info - %s",
                    pajamuIrasasArrayList.get(i).getSuma(),
                    pajamuIrasasArrayList.get(i).getData(),
                    pajamuIrasasArrayList.get(i).getKategorija(),
                    pajamuIrasasArrayList.get(i).getPozymisaArIbanka(),
                    pajamuIrasasArrayList.get(i).getPapildomaInfo());
            System.out.println(pajamuIsvedimas);
        }
    }

    public void visosIslaidos() {
        for (int i = 0; i < islaiduIrasasArrayList.size(); i++) {
            String islaiduIsvedimas = String.format("Išlaidos: %,.2f EUR -> data: %s, kategorija - %s, atsiskaitymas - %s, info - %s",
                    islaiduIrasasArrayList.get(i).getSuma(),
                    islaiduIrasasArrayList.get(i).getDataLaikas(),
                    islaiduIrasasArrayList.get(i).getKategorija(),
                    islaiduIrasasArrayList.get(i).getAtsiskaitymoBudas(),
                    islaiduIrasasArrayList.get(i).getPapildomaInfo());
            System.out.println(islaiduIsvedimas);

        }
    }
}
