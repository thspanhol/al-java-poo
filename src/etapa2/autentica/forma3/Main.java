package etapa2.autentica.forma3;

public class Main {

    static void validaUsuario(Usuario u) {

        if (u instanceof UsuarioNovo uNovo) {
            System.out.println("Valida usuário com a String token");
            //UsuarioNovo uNovo = (UsuarioNovo) u;
            System.out.println(uNovo.getToken());
        };

        if (u instanceof UsuarioAntigo uAntigo) {
            System.out.println("Valida usuário com o número id");
            //UsuarioAntigo uAntigo = (UsuarioAntigo) u;
            System.out.println(uAntigo.getId());
        };
    }

    public static void main(String[] args) {

        UsuarioNovo usuarioNovo = new UsuarioNovo("UsuarioNovo", "usuarionovo@gmail.com", "senhaUsuarioNovo", "ABCDE");
        UsuarioAntigo usuarioAntigo = new UsuarioAntigo("UsuarioAntigo", "usuarioantigo@gmail.com", "senhaUsuarioAntigo", 12345);

        validaUsuario(usuarioNovo);
        validaUsuario(usuarioAntigo);

    }
}
