package etapa2.autentica.forma3;

class UsuarioAntigo extends Usuario {

    private Integer id;

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
