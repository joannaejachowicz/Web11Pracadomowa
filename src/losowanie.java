import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class losowanie {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0; i < 5;i++){
            list.add(random.nextInt(9));
        }

        System.out.println(Arrays.toString(list.toArray()));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę z przedziału 0-9");
        int givenNumber = scanner.nextInt();

        if(list.contains(givenNumber))
                System.out.println("Jest pod indeksem: " + list.indexOf(givenNumber));
        else
                System.out.println("Nie ma. Nie graj dziś w lotto");
    }
}
