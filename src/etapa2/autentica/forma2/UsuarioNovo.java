package etapa2.autentica.forma2;

class UsuarioNovo extends Usuario implements ValidaUsuarioInt{

    private String token;

    @Override
    public String getAutenticacao() {
        return token;
    }

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
