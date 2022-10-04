//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scan = new Scanner(System.in);

        double valor; // valor ganho por hora
        int hora; //horas trabalhadas
        double salario;

        System.out.println("Quato você ganha por hora?");
        valor = scan.nextDouble();
        
        System.out.println("Por quantas horas você trabalhou esse mês?");
        hora = scan.nextInt();

        scan.close();

        salario = hora * valor;
        System.out.println("O seu salário total deste mês é de " + salario);
    }
}
