package Exercico4;

import java.util.Scanner;

public class Quarto {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int num = 0;

       while (num >= 0 &&  num <= 100) {
           System.out.println(" entre com o numero ");
           num = s.nextInt();

           if (num >= 0 && num <= 100) {

               System.out.println(" o numero fica entre 0 e 100");

           } else {
               System.out.println(" o numero nao esta entre 0 e 100");
           }

       }

    }
}
