package etapa2;

public class Main {

//    static void validaUsuario(Usuario u) {
//        System.out.println(u.getNome());
//        if(u.getToken){
//            System.out.println("Token");
//        }
//    }

    public static void main(String[] args) {

        Musica musica1 = new Musica();

        musica1.setTitulo("Rock Rural");
        musica1.setArtista("Bicharada");
        musica1.setAnoLancamento(2004);

        musica1.avaliar(8);
        musica1.avaliar(10);
        musica1.avaliar(8);

        musica1.fichaTecnica();
        System.out.println("Média das avaliações: " + musica1.mediaAvaliacoes());

        UsuarioNovo usuarioNovo = new UsuarioNovo("UsuarioNovo", "usuarionovo@gmail.com", "senhaUsuarioNovo", "ABCDE");
        UsuarioAntigo usuarioAntigo = new UsuarioAntigo("UsuarioAntigo", "usuarioantigo@gmail.com", "senhaUsuarioAntigo", 12345);

    }
}
