package etapa1;

import java.util.Scanner;

public class CaixaBanco {
    public static void main(String[] args) {

        String nome = "Thales Spanhol";
        String conta = "Corrente";
        double saldo = 7000.00;
        Scanner leitura = new Scanner(System.in);

        String intro = """
                ****************************************
                Dados do Cliente
                Nome:              %s
                Tipo da Conta:     %s
                Saldo:             %.2f
                ****************************************
                """.formatted(nome, conta, saldo);

        System.out.println(intro);

        int operacoes = 0;

        while (operacoes != 4) {
            System.out.println("""
                    Operações:
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    Digite a opção desejada:
                    """);
            operacoes = leitura.nextInt();

            switch (operacoes) {
                case 1:
                    System.out.println("Seu saldo é " + saldo);
                    break;
                case 2:
                    System.out.print("Informe qual valor irá receber: ");
                    double receber = leitura.nextDouble();
                    saldo += receber;
                    System.out.println("Valor recebido.");
                    break;
                case 3:
                    System.out.print("Informe qual valor irá transferir: ");
                    double transferir = leitura.nextDouble();
                    if (transferir > saldo) {
                        System.out.println("Saldo insuficiente para essa transferência.");
                    } else {
                        saldo -= transferir;
                        System.out.println("Valor transferido.");
                    }
                    break;
                case 4:
                    System.out.println("Operações encerradas.");
                    break;
                default:
                    System.out.println("Operação não identificada.");
                    break;
            }
        }
    }
}
