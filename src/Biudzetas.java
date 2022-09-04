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
        System.out.println("Ivesk kategorija:");
        String kategorija = sc.next();
        System.out.println("pasirink ar į banką (jei taip įvedame <true>, jei ne <false>):");
        boolean arIbanka = sc.nextBoolean();
        System.out.println("Įvesk papildomą informaciją:");
        String papildomaInfo = sc.next();
        PajamuIrasas pajamuI = new PajamuIrasas(suma, data, kategorija, arIbanka, papildomaInfo);
        pajamuIrasasArrayList.add(pajamuI);
        System.out.println("Pridėtas pajamų įrašas");

    }


    public void pridetiIslaiduIrasa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įvesk sumą: ");
        float suma = sc.nextFloat();
        LocalDateTime dataLaikas = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
        String formatuotaData = dataLaikas.format(dtf);
        System.out.println("Įveskite kategoriją: ");
        String kategorija = sc.next();
        System.out.println("Įveskite atsiskaitymo būdą");
        String atsikBudas = sc.next();
        System.out.println("Įvesk papildomą informaciją:");
        String papildomaInfo = sc.next();
        IslaiduIrasas islaiduI = new IslaiduIrasas(suma, formatuotaData, kategorija, atsikBudas, papildomaInfo);
        islaiduIrasasArrayList.add(islaiduI);
    }

    public void gautiPajamuIrasa(int i) {
        System.out.println("Suma: " + pajamuIrasasArrayList.get(i).getSuma() + "\nData: " + pajamuIrasasArrayList.get(i).getData() + "\nKategorija: " +
                pajamuIrasasArrayList.get(i).getKategorija() + "\nĮ banką: " + pajamuIrasasArrayList.get(i).isPozymisaArIbanka() + "\nPapildoma informacija: " + pajamuIrasasArrayList.get(i).getPapildomaInfo());
        System.out.println();
    }

    public void gautiIslaiduIrasa(int i) {
        System.out.println("Suma: " + islaiduIrasasArrayList.get(i).getSuma() + "\nData: " + islaiduIrasasArrayList.get(i).getDataLaikas() + "\nKategorija: " +
                islaiduIrasasArrayList.get(i).getKategorija() + "\nAtsiskaitymo būdas: " + islaiduIrasasArrayList.get(i).getAtsiskaitymoBudas() + "\nPapildoma informacija: " + islaiduIrasasArrayList.get(i).getPapildomaInfo());
        System.out.println();
    }

}