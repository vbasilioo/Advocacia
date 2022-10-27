package DTO;

public class MensagensDTO{
    
    private int id_mensagem;
    private String email_usuario;
    private String mensagem_usuario;

    public int getId_mensagem() {
        return id_mensagem;
    }

    public void setId_mensagem(int id_mensagem) {
        this.id_mensagem = id_mensagem;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getMensagem_usuario() {
        return mensagem_usuario;
    }

    public void setMensagem_usuario(String mensagem_usuario) {
        this.mensagem_usuario = mensagem_usuario;
    }
    
}
