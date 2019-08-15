import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Prostokat extends Figura{

    int bokA;
    int bokB;

    public void pole(){
        System.out.println("wprowadz bok A");
        Scanner bok1 = new Scanner(System.in);
        bokA = bok1.nextInt();
        System.out.println("wprowadz bok b");
        Scanner bok2 = new Scanner(System.in);
        bokB = bok2.nextInt();

        pole = bokA*bokB;

        System.out.println("Pole prostokata wynosi: "+ pole);
    }
    public void obwod(){
        Scanner bok3 = new Scanner(System.in);
        bokA = bok3.nextInt();
        Scanner bok4 = new Scanner(System.in);
        bokB = bok4.nextInt();

        obwod = bokA+bokA+bokB+bokB;

        System.out.println("obwod prostokata wynosi: "+ obwod);
    }




}
