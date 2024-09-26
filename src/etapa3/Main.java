package etapa3;

import etapa2.Musica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    }
}
