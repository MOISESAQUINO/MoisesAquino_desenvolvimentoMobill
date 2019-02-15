package Exercicio3;

import java.util.Scanner;

public class Terceiro {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("valor do salario bruto");
        double salBruto = s.nextDouble();

        System.out.println("valor do emprestimo");
        double valIpres = s.nextDouble();

        if (valIpres >= 30) {
            System.out.println("o valor excede o maximo permitido");

        }else {
        System.out.println("emprestimo realizado com sucesso!!!!!!!!!!") ;
            System.out.println( "o valor concedido: " + valIpres/100*(salBruto));
        }

    }
}