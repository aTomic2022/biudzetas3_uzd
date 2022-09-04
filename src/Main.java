import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biudzetas b1 = new Biudzetas();
        Scanner input = new Scanner(System.in);
        boolean runProgram = true;
        int pajamuIrasuKiekis = 0;
        int islaiduIrasuKiekis = 0;
        while (runProgram) {
            menuChoise();
            int choise = input.nextInt();
            switch (choise) {
                case 1 -> {
                    b1.pridetiPajamuIrasa();
                    pajamuIrasuKiekis++;
                }
                case 2 -> {
                    b1.pridetiIslaiduIrasa();
                    islaiduIrasuKiekis++;
                }
                case 3 -> {
                    System.out.println("Įveskite, kurį įrašą norite pamatyti. Turimų įrašų kiekis " + pajamuIrasuKiekis);
                    int pajamuNr = input.nextInt();
                    b1.gautiPajamuIrasa(pajamuNr - 1);
                }
                case 4 -> {
                    System.out.println("Įveskite, kurį įrašą norite pamatyti. Turimų įrašų kiekis: " + islaiduIrasuKiekis);
                    int islaiduNr = input.nextInt();
                    b1.gautiIslaiduIrasa(islaiduNr - 1);
                }
                case 5 -> {
                    b1.balansas();
                }
                case 6 -> {
                    runProgram = false;
                    input.close();
                }

                default -> System.out.println("komanda [" + choise + "] nepalaikoma");
            }

        }
    }

    public static void menuChoise() {
        System.out.println("""

                Pasirinkite vieną iš veiksmų įvesdami skaičių:\s

                 1. Norite įvesti pajamas spauskite <1>
                 2. Norite įvesti išlaidas spauskite <2>
                 3. Sužinokite kiek gavote pajamų spauskite <3>
                 4. Sužinokite kiek išleidote spauskite <4>
                 5. Sužinokite balansą spauskite <5>
                 6. Išeiti spauskite <6>"""
        );
    }


}