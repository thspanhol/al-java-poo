package etapa4;

public class Filme {

    //@SerializedName("Title") Usado para atribuir o atributo da response a um atributo de classe com outro nome
    String nome;
    int anoLancamento;
    String diretor;

    public Filme(FilmeOmdb meuFilmeOmdb) {
        this.nome = meuFilmeOmdb.title();
        this.anoLancamento = Integer.valueOf(meuFilmeOmdb.year());
        this.diretor = meuFilmeOmdb.director();
    }

    // Comentado para persistir os dados no formato json
//    @Override
//    public String toString() {
//        return "Filme: " + nome + ", Lancamento: " + anoLancamento + ", Diretor: " + diretor;
//    }


    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", diretor='" + diretor + '\'' +
                '}';
    }
}
