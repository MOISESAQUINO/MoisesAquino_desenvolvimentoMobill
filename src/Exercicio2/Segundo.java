package Exercicio2;

import java.util.Scanner;

public class Segundo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double valor_PI = 3.141559;
        System.out.println("entre com raio : ");
        double valor_Raio = s.nextDouble();
        System.out.println("entre com a altura:");
        double valor_Altura= s.nextDouble();

        double volume = valor_PI * (valor_Raio*valor_Raio) * valor_Altura;
        System.out.println("volume = " + volume);

    }
}
