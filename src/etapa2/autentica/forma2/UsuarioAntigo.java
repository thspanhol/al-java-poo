package etapa2.autentica.forma2;

class UsuarioAntigo extends Usuario implements ValidaUsuarioInt{

    private Integer id;

    @Override
    public Integer getAutenticacao() {
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
