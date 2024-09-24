package etapa2;

public class UsuarioNovo extends Usuario {

    private String token;

    public UsuarioNovo(String nome, String email, String senha, String token) {
        super(nome, email, senha);
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
