package zajecia;

/**
 * Created by mateuszstanislaw on 11.04.2017.
 */

import java.util.Scanner;

public class bomba {
    public static void main(String[] args){
        Scanner odczyt = new Scanner(System.in);
        int zegar;

        System.out.println("Podaj czas bomby: ");

        for(zegar=odczyt.nextInt(); zegar>0; zegar--)
            System.out.println("Bomba wybuchnie za "+zegar);
        System.out.println("BUM!");
    }
}

