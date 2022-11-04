package DTO;

public class UsuariosDTO{
    
    private int id_usuario;
    private String id_processo_associado, cargo_usuario;
    private String email_usuario;
    private String nome_usuario, senha_usuario;

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the id_processo_associado
     */
    public String getId_processo_associado() {
        return id_processo_associado;
    }

    /**
     * @param id_processo_associado the id_processo_associado to set
     */
    public void setId_processo_associado(String id_processo_associado) {
        this.id_processo_associado = id_processo_associado;
    }

    /**
     * @return the cargo_usuario
     */
    public String getCargo_usuario() {
        return cargo_usuario;
    }

    /**
     * @param cargo_usuario the cargo_usuario to set
     */
    public void setCargo_usuario(String cargo_usuario) {
        this.cargo_usuario = cargo_usuario;
    }

    /**
     * @return the email_usuario
     */
    public String getEmail_usuario() {
        return email_usuario;
    }

    /**
     * @param email_usuario the email_usuario to set
     */
    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    /**
     * @return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    /**
     * @return the senha_usuario
     */
    public String getSenha_usuario() {
        return senha_usuario;
    }

    /**
     * @param senha_usuario the senha_usuario to set
     */
    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
 
    
}
