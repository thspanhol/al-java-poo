package etapa2;

public class Main {

    public static void main(String[] args) {

        Musica musica1 = new Musica("Rock Rural", "Bicharada", 2004);

//        musica1.setTitulo("Rock Rural");
//        musica1.setArtista("Bicharada");
//        musica1.setAnoLancamento(2004);

        musica1.avaliar(8);
        musica1.avaliar(10);
        musica1.avaliar(8);

        musica1.fichaTecnica();
        System.out.println("Média das avaliações: " + musica1.mediaAvaliacoes());

    }
}
