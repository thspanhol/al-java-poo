package etapa2.autentica.forma1;

public class Main {

    static void validaUsuario(Usuario u) {

        if (u.getAutenticacao() instanceof String) {
            System.out.println("Valida usuário com a String token");
        };

        if (u.getAutenticacao() instanceof Integer) {
            System.out.println("Valida usuário com o número id");
        };
    }

    public static void main(String[] args) {

        UsuarioNovo usuarioNovo = new UsuarioNovo("UsuarioNovo", "usuarionovo@gmail.com", "senhaUsuarioNovo", "ABCDE");
        UsuarioAntigo usuarioAntigo = new UsuarioAntigo("UsuarioAntigo", "usuarioantigo@gmail.com", "senhaUsuarioAntigo", 12345);

        validaUsuario(usuarioNovo);
        validaUsuario(usuarioAntigo);

    }
}
