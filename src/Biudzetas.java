import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Biudzetas {
    PajamuIrasas[] pajamos = new PajamuIrasas[100];
    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

    public void pridetiPajamuIrasa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įvesk suma:");
        float suma = sc.nextFloat();
        LocalDate data = LocalDate.now();
        System.out.println("Ivesk kategorija:");
        String kategorija = sc.next();
        System.out.println("pasirink ar į banką (jei taip įvedame <true>, jei ne <false>):");
        boolean arIbanka = sc.nextBoolean();
        System.out.println("Įvesk papildomą informaciją:");
        String papildomaInfo = sc.next();
        PajamuIrasas pajamuI = new PajamuIrasas(suma, data, kategorija, arIbanka, papildomaInfo);

        for (int i = 0; i < pajamos.length; i++) {
            PajamuIrasas pajamuObjektas = pajamos[i];
            if (pajamuObjektas == null) {
                pajamos[i] = pajamuI;
                break;
            }
        }
        System.out.println("Pridėtas pajamų įrašas");

    }


    public void pridetiIslaiduIrasa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įvesk sumą: ");
        float suma = sc.nextFloat();
        LocalDateTime dataLaikas = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
        String formatuotaData = dataLaikas.format(dtf);
        System.out.println(formatuotaData);

        System.out.println("Įveskite kategoriją: ");
        String kategorija = sc.next();
        System.out.println("Įveskite atsiskaitymo būdą");
        String atsikBudas = sc.next();
        System.out.println("Įvesk papildomą informaciją:");
        String papildomaInfo = sc.next();
        IslaiduIrasas islaiduI = new IslaiduIrasas(suma, formatuotaData, kategorija, atsikBudas, papildomaInfo);
        for (int i = 0; i < islaidos.length; i++) {
            IslaiduIrasas islaiduObjektas = islaidos[i];
            if (islaiduObjektas == null) {
                islaidos[i] = islaiduI;
                break;
            }
        }
        System.out.println("Pridėtas išlaidų įrašas");
        System.out.println();
    }

    public void gautiPajamuIrasa(int i) {
        System.out.println("Suma: " + pajamos[i].getSuma() + "\nData: " + pajamos[i].getData() + "\nKategorija: " +
                pajamos[i].getKategorija() + "\nĮ banką: " + pajamos[i].isPozymisaArIbanka() + "\nPapildoma informacija: " + pajamos[i].getPapildomaInfo());
        System.out.println();
    }

    public void gautiIslaiduIrasa(int i) {
        System.out.println("Suma: " + islaidos[i].getSuma() + "\nData: " + islaidos[i].getDataLaikas() + "\nKategorija: " +
                islaidos[i].getKategorija() + "\nAtsiskaitymo būdas: " + islaidos[i].getAtsiskaitymoBudas() + "\nPapildoma informacija: " + islaidos[i].getPapildomaInfo());
        System.out.println();
    }

}