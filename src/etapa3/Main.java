package etapa3;

import etapa2.Musica;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        var musica1 = new Musica("Rock", "Roqueiro", 2006);
        var musica2 = new Musica("Pop", "Popeiro", 2010);
        var musica3 = new Musica("Samba", "Sambeiro", 1990);

        // É uma boa prática tipar pela interface
        // A interface List está presente em todas as listas
        // Conferir também as interfaces Collection (mãe de todas coleções), set e map
        List<Musica> listMusicas = new ArrayList<>();

        listMusicas.add(musica1);
        listMusicas.add(musica2);
        listMusicas.add(musica3);

        // Todas classes do java estendem Object (toString é um metodo de Object)
        // Ao printar a lista, é mostrado um array com o toString dos objetos (classe/nome/hashcode)
        // Ao reescrever o toString na classe Musica, o array foi printado de forma personalizada

        System.out.println("A lista tem " + listMusicas.size() + "músicas.");
        System.out.println("A primeira música da lista é a " + listMusicas.get(0).getTitulo());
        System.out.println(listMusicas);

        // Sintaxes diferentes de for
        //for (var musica: listMusicas) {
        //    System.out.println(musica);
        //}
        //listMusicas.forEach(m -> System.out.println(m));
        //listMusicas.forEach(System.out::println);

        // Após implementar a interface Comparable na classe Musica, foi possível utilizar o sort
        Collections.sort(listMusicas);
        System.out.println(listMusicas);
        // Ao utilizar o sort da prória lista, posso usar o comparator para especificar um elemento comparável
        listMusicas.sort(Comparator.comparing(Musica::getAnoLancamento));
        System.out.println(listMusicas);

//        CartaoDeCredito meuCartao = new CartaoDeCredito();
//        List<String> comprasFeitas = new ArrayList<>();
//        meuCartao.setComprasFeitas(comprasFeitas);
//        Scanner leitura = new Scanner(System.in);
//
//        System.out.println("Informe o saldo do seu cartão:");
//        meuCartao.setSaldo(leitura.nextDouble());
//
//        int encerrarApp = 1;
//        while (encerrarApp == 1) {
//            System.out.println("Digite a descrição da compra:");
//            String descricaoCompra = leitura.next();
//            System.out.println("Digite o valor da compra:");
//            double valorCompra = leitura.nextDouble();
//
//            if (valorCompra <= meuCartao.getSaldo()) {
//                meuCartao.setSaldo(meuCartao.getSaldo() - valorCompra);
//                meuCartao.addCompra(descricaoCompra + " - " + valorCompra);
//                System.out.println("Compra realizada com sucesso!");
//                System.out.println("Digite 0 para sair ou 1 para continuar.");
//                encerrarApp = leitura.nextInt();
//            } else {
//                System.out.println("Você não tem saldo para realizar essa compra.");
//                encerrarApp = 0;
//            }
//        }
//
//        Stream<String> comprasOrdenadas = comprasFeitas.stream()
//                .sorted((c1, c2) -> {
//                    var index1 = c1.indexOf("-");
//                    var index2 = c2.indexOf("-");
//                    return Double.compare(Double.parseDouble(c1.substring(index1 +2)), Double.parseDouble(c2.substring(index2 +2)));
//                });
//
//        System.out.println("Compras encerradas.");
//        System.out.println("------------------------------");
//        System.out.println("Histórico de compras:");
//        comprasOrdenadas.forEach(c -> System.out.println(c));
//        System.out.println("------------------------------");
//        System.out.println("Seu saldo atual é: " + meuCartao.getSaldo());

        CartaoDeCreditoNovo meuCartao = new CartaoDeCreditoNovo();
        List<Compra> comprasFeitas = new ArrayList<>();
        meuCartao.setComprasFeitas(comprasFeitas);
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o saldo do seu cartão:");
        meuCartao.setSaldo(leitura.nextDouble());

        int encerrarApp = 1;
        while (encerrarApp == 1) {
            System.out.println("Digite a descrição da compra:");
            String descricaoCompra = leitura.next();
            System.out.println("Digite o valor da compra:");
            double valorCompra = leitura.nextDouble();

            if (valorCompra <= meuCartao.getSaldo()) {
                meuCartao.setSaldo(meuCartao.getSaldo() - valorCompra);
                meuCartao.addCompra(new Compra(descricaoCompra, valorCompra));
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar.");
                encerrarApp = leitura.nextInt();
            } else {
                System.out.println("Você não tem saldo para realizar essa compra.");
                encerrarApp = 0;
            }
        }

        System.out.println("Compras encerradas.");
        System.out.println("------------------------------");
        System.out.println("Histórico de compras:");

        // ArrayList ordenado pelo Comparator e apresentado o toString de Compra reescrito -------
        //meuCartao.getComprasFeitas().sort(Comparator.comparing(Compra::getValor));
        //meuCartao.getComprasFeitas().forEach(System.out::println);

        // ArrayList ordenado pela classe Collections após implementar a interface Comparable na classe Compra -------
        Collections.sort(meuCartao.getComprasFeitas());
        meuCartao.getComprasFeitas().forEach(System.out::println);

        System.out.println("------------------------------");
        System.out.println("Seu saldo atual é: " + meuCartao.getSaldo());
    }
}
