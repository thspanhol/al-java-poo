package etapa1;

public class Main {
    public static void main(String[] args) {

        String nome = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);

        // Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        double nota1 = 6.57;
        double nota2 = 8.56;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: %.2f".formatted(media));

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double varDouble = 7.56;
        int varInt = (int) varDouble;
        System.out.println("Casting double-int " + varInt);


        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char varChar = 'O';
        String varString = "Teste";
        System.out.println("Concatenação char-var: " + varChar + " " + varString);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 10.50;
        int quantidade = 7;
        System.out.println("Valor total: " + precoProduto * quantidade);

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 28.56;
        System.out.println("O valor em dólares equivale a %.2f Reais.".formatted(valorEmDolares/4.94));

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 145.50;
        double percentualDesconto = 15;
        double totalDesconto = (percentualDesconto / 100) * precoOriginal;
        System.out.println("Total desconto: %.2f".formatted(totalDesconto));
        double novoValor = precoOriginal - totalDesconto;
        System.out.println("Novo preço: %.2f".formatted(novoValor));

    }
}