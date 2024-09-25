package etapa2.autentica.forma1;

class UsuarioAntigo extends Usuario {

    private Integer id;

    @Override
    public Object getAutenticacao() {
        return id;
    }

    public UsuarioAntigo(String nome, String email, String senha, Integer id) {
        super(nome, email, senha);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
