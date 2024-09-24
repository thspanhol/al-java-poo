package etapa1;

import java.util.Random;
import java.util.Scanner;

public class Advinha {
    public static void main(String[] args) {

        // Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

        int numero = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);

        //System.out.println(numero);

        for (int i = 0; i < 5; i++) {
            System.out.println("Tente acertar o número gerado de 1 a 100:");
            int chute = leitura.nextInt();

            if (chute == numero) {
                System.out.println("Parabéns, era o número "  + numero + ".");
                return;
            }

            if (chute != numero && i == 4) {
                System.out.println("Nenhuma tentativa foi correta, o número era  "  + numero + ".");
            }
        }

        System.out.print("Digite 1 se deseja calcular a área de um quadrado e 2 se deseja calcular a área de um circulo: ");
        int opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.print("informe o lado do quadrado: ");
            double lado = leitura.nextDouble();
            System.out.print("A área do quadrado é : " + lado * lado);
        }

        if (opcao == 2) {
            System.out.print("informe o raio do circulo: ");
            double raio = leitura.nextDouble();
            System.out.print("A área do circulo é : " + 3.14159265359 * (raio * raio));
        }
    }
}
