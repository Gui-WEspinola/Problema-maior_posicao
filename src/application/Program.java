package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }

        double maxValue = vect[0];
        int valuePosition = 0;

        for (int i = 0; i < vect.length; i++){
            if (maxValue < vect[i]){
                maxValue = vect[i];
                valuePosition = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maxValue);
        System.out.println("POSICAO DO MAIOR VALOR = " + valuePosition);

        scanner.close();
    }
}
