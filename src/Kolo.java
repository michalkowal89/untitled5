import java.util.Scanner;

public class Kolo extends Figura{

    int promien;

    public void pole(){
        Scanner polekolo = new Scanner(System.in);
        System.out.println("wprowadz promien");
        promien = polekolo.nextInt();

        pole = 3.14*promien*promien;

        System.out.println("Pole koła wynosi: "+ pole);
    }
    public void obwod(){
        Scanner obwodkolo = new Scanner(System.in);
        System.out.println("wprowadz promien");
        obwod = obwodkolo.nextInt();

        obwod = 3.14*2*promien;

        System.out.println("obwod koła wynosi: "+ obwod);
    }


}
