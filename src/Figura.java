import java.util.Scanner;

public class Figura{

    double pole;
    double obwod;

    public void printMenu() {
        System.out.println("Wybierz co obliczyć");
        System.out.println("1. Pole");
        System.out.println("2. Obwód");

    }

    static void skaner(){
        Scanner menu2 = new Scanner(System.in);
        int wybor2 = menu2.nextInt();

        Kolo objekt2 = new Kolo();


        switch(wybor2){
            case 1:

                break;
            case 2:
                objekt2.obwod();

                break;
                default: System.out.println("błedny wybór");

        }




    }






}
