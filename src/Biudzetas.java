import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {

    ArrayList<Irasas> list = new ArrayList<Irasas>();
    Scanner sc = new Scanner(System.in);

    public void pridetiIrasa(Irasas irasas) {
        System.out.println("Įvesk suma:");
        float suma = sc.nextFloat();
        LocalDateTime data = LocalDateTime.now();
        System.out.println("Įvesk papildomą informaciją:");
        String papildomaInfo = sc.next();
        if (irasas instanceof PajamuIrasas) {
//            list.add((PajamuIrasas) irasas);
            System.out.println("Ivesk kategorija:");
            String pajamuKategorija = sc.next();
            System.out.println("pasirink ar į banką (jei taip įvedame <true>, jei ne <false>):");
            boolean arIbanka = sc.nextBoolean();
            System.out.println("Įveskite pajamų tipą:");
            String pajamuTipas = sc.next();
            int counter = PajamuIrasas.countas++;
            Irasas pajamuI = new PajamuIrasas(suma, data, papildomaInfo, counter, arIbanka, pajamuKategorija, pajamuTipas);
            list.add(pajamuI);
            System.out.println("Pridėtas pajamų įrašas");
        } else if (irasas instanceof IslaiduIrasas) {
            list.add((IslaiduIrasas) irasas);
            System.out.println("Įveskite kategoriją: ");
            String islaiduKategorija = sc.next();
            System.out.println("Įveskite atsiskaitymo būdą");
            String atsikBudas = sc.next();
            System.out.println("Įveskite išlaidų tipą");
            String islaiduTipas = sc.next();
            int counter = IslaiduIrasas.countas++;
            Irasas islaiduI = new IslaiduIrasas(suma, data, papildomaInfo, counter, atsikBudas, islaiduKategorija, islaiduTipas);
            list.add(islaiduI);
        }


    }

    public void pridetiPajamuIrasa() {
        System.out.println("Įvesk suma:");
        float suma = sc.nextFloat();
        LocalDateTime data = LocalDateTime.now();
        System.out.println("Ivesk kategorija:");
        String pajamuKategorija = sc.next();
        System.out.println("pasirink ar į banką (jei taip įvedame <true>, jei ne <false>):");
        boolean arIbanka = sc.nextBoolean();
        System.out.println("Įvesk papildomą informaciją:");
        String papildomaInfo = sc.next();
        System.out.println("Įveskite pajamų tipą:");
        String pajamuTipas = sc.next();
        int counter = PajamuIrasas.countas++;
        Irasas pajamuI = new PajamuIrasas(suma, data, papildomaInfo, counter, arIbanka, pajamuKategorija, pajamuTipas);
        list.add(pajamuI);
        System.out.println("Pridėtas pajamų įrašas");

    }


    public void pridetiIslaiduIrasa() {
        System.out.println("Įvesk sumą: ");
        float suma = sc.nextFloat();
        LocalDateTime data = LocalDateTime.now();

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        String formatuotaDataLaikas = dataLaikas.format(dtf);
        System.out.println("Įveskite kategoriją: ");
        String islaiduKategorija = sc.next();
        System.out.println("Įveskite atsiskaitymo būdą");
        String atsikBudas = sc.next();
        System.out.println("Įvesk papildomą informaciją:");
        String papildomaInfo = sc.next();
        int counter = IslaiduIrasas.countas++;
        System.out.println("Įveskite išlaidų tipą");
        String islaiduTipas = sc.next();
        Irasas islaiduI = new IslaiduIrasas(suma, data, papildomaInfo, counter, atsikBudas, islaiduKategorija, islaiduTipas);
        list.add(islaiduI);
    }

    public void gautiPajamuIrasa(int i) {
        System.out.println("Suma: " + list.get(i).getSuma()
                + "\nData: " + list.get(i).getData()
//                + "\nKategorija: " + ((PajamuIrasas) i).getPajamuKategorija()
//                + "\nĮ banką: " + ((PajamuIrasas) i).getPozymisaArIbanka()
                + "\nPapildoma informacija: " + list.get(i).getPapildomaInfo());
        System.out.println();
    }

    public void gautiIslaiduIrasa(int i) {
        System.out.println("Suma: " + list.get(i).getSuma()
                + "\nData: " + list.get(i).getData()
//                + "\nKategorija: " + list.get(i).getKategorija()
//                + "\nAtsiskaitymo būdas: " + list.get(i).getAtsiskaitymoBudas()
                + "\nPapildoma informacija: " + list.get(i).getPapildomaInfo());
        System.out.println();
    }

    public void balansas() {
        double pajamuSuma = 0;
        double islaiduSuma = 0;
        double balansas;
        for (int i = 0; i < list.size(); i++) {
            pajamuSuma = pajamuSuma + list.get(i).getSuma();
        }
        for (int i = 0; i < list.size(); i++) {
            islaiduSuma = islaiduSuma + list.get(i).getSuma();
        }
        balansas = pajamuSuma - islaiduSuma;
        System.out.println("Balansas => " + balansas);
    }

    public void visosPajamos() {
        for (int i = 0; i < list.size(); i++) {
            String pajamuIsvedimas = String.format("Pajamos: %,.2f EUR, -> data:%s, kategorija - %s, pozymis - %b, info - %s, unikalus numeris - %d",
                    list.get(i).getSuma(),
                    list.get(i).getData(),
//                    list.get(i).getKategorija(),
//                    list.get(i).getPozymisaArIbanka(),
                    list.get(i).getPapildomaInfo(),
                    list.get(i).getCounter());

            System.out.println(pajamuIsvedimas);
        }
    }

    public void visosIslaidos() {
        for (int i = 0; i < list.size(); i++) {
            String islaiduIsvedimas = String.format("Išlaidos: %,.2f EUR -> data: %s, kategorija - %s, atsiskaitymas - %s, info - %s, unikalus numeris - %d",
                    list.get(i).getSuma(),
                    list.get(i).getData(),
//                    list.get(i).getKategorija(),
//                    list.get(i).getAtsiskaitymoBudas(),
                    list.get(i).getPapildomaInfo(),
                    list.get(i).getCounter());
            System.out.println(islaiduIsvedimas);

        }
    }

    public void trintiPajamuIrasa() {
        System.out.println("Esami pajamų įrašai:");
        visosPajamos();
        System.out.println("Jei norite ištrinti pajamų įrašą, įveskite įrašo unikalų numeri:");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int skP = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCounter() == skP) {
                list.remove(i);
                System.out.println("Pajamų įrašas [" + skP + "] pašalintas");
            }
        }
    }

    public void trintiIslaiduIrasa() {
        System.out.println("Esami išlaidų irašai:");
        visosIslaidos();
        System.out.println("Jei norite ištrinti išlaidų įrašą, įveskite įrašo unikalų numeri:");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int skI = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCounter() == skI) {
                list.remove(i);
                System.out.println("Išlaidų įrašas [" + skI + "] pašalintas");
            }

        }
    }
}
