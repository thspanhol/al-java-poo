package etapa1;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Informe sua nota para ele: ");
        double nota = leitura.nextDouble();
        System.out.println("Seu filme favorito é " + filme + " e sua nota para ele é " + nota + ".");

        double notaFor = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.print("Informe notas para depois calcular a média: ");
            double notaLoop = leitura.nextDouble();
            notaFor += notaLoop;
        }

        System.out.println("A média das notas é: " + notaFor / 3);

        double notaWhile = 0;
        double totalWhile = 0;
        int loopWhile = 0;

        while (notaWhile != -1) {
            System.out.println("Informe notas para obter a média, digite -1 quando desejar parar.");
            notaWhile = leitura.nextDouble();

            if (notaWhile != -1) {
                totalWhile += notaWhile;
                loopWhile++;
            }
        }

        System.out.println("A média das suas notas é " + totalWhile/loopWhile);

    }
}
