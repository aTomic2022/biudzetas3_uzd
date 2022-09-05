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

                    Irasas pajamuIrasas = null;
                    b1.pridetiIrasa(pajamuIrasas);
//                    b1.pridetiPajamuIrasa();
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
                    b1.visosPajamos();
                }
                case 7 -> {
                    b1.visosIslaidos();
                }
                case 8 -> {
                    b1.trintiPajamuIrasa();
                }
                case 9 -> {
                    b1.trintiIslaiduIrasa();
                }
                case 10 -> {
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
                 6. Visos pajamos spauskite <6>
                 7. Visos išlaidos spauskite <7>
                 8. Ištrinti pajamų įrašą spauskite <8>
                 9. Ištrinti išlaidų įrašą spauskite <9>
                 10. Išeiti spauskite <10>"""
        );
    }


}