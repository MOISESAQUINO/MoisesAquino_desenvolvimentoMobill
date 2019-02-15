package Exercicio1;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Primeiro {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println( " entra com a despesa : " );
        double conta = s.nextDouble();
        double gorjeta = (conta*10/100);
        System.out.println("valor da compra : " + conta);
        System.out.println("valor da gorjeta : " + gorjeta);
        System.out.println("valor total : " + (conta + gorjeta));


    }
}
