package etapa2;

public class Musica implements Comparable<Musica> {

    // Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

    private String titulo;
    private String artista;
    private int anoLancamento;
    private int avaliacao;
    private int numAvaliacoes;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    void fichaTecnica () {
        System.out.println("Música " + titulo + " lançada em " + anoLancamento + " por " + artista + ".");
    }

    void avaliar (int nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    int mediaAvaliacoes () {
        int media = avaliacao / numAvaliacoes;
        return media;
    }

    @Override
    public String toString() {
        return titulo + " (" + artista + "/" + anoLancamento + ")";
    }

    @Override
    public int compareTo(Musica o) {
        return this.getTitulo().compareTo(o.getTitulo());
    }
}